package DAO;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import mapper.RowMapper;


public class AbstractDAO {
	public static Connection getConnection(){
        String dbURL =  "jdbc:mysql://localhost:3306/tds_company?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException|ClassNotFoundException e) {
//            JOptionPane.showMessageDialog(null, "Kết nối thất bại!");
            System.out.println(e.getMessage());
            return null;
        }
	
        
    }

    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
        List<T> rs =new ArrayList<>();
        Connection connection =null;
        PreparedStatement statement =null;
        ResultSet resultSet=null;
        try {
            connection=getConnection();
            statement=connection.prepareStatement(sql);
            setParameter(statement,parameters);
            resultSet= statement.executeQuery();
            while(resultSet.next()){
                rs.add(rowMapper.mapRow(resultSet));
            }
            return rs;
        } catch (SQLException e) {
            return null;
        }finally {
            try{
                if(connection!=null){
                    connection.close();
                }
                if(statement!=null){
                    statement.close();
                }
                if(resultSet!=null){
                    resultSet.close();
                }
            }catch (SQLException e){
                return null;
            }
        }

    }

    public boolean update(String sql, Object... parameters) {
        Connection connection =null;
        PreparedStatement statement=null;
        try{
            connection=getConnection();
            connection.setAutoCommit(false);
            statement= connection.prepareStatement(sql);
            setParameter(statement,parameters);
            statement.executeUpdate();
            connection.commit();
            return true;
        }catch (SQLException e){
            try{
                connection.rollback();
            }catch (SQLException e1){
                System.out.println("Error when update : "+e1.getMessage());
            }
        }finally {
            try{
                if(connection!=null){
                    connection.close();
                }
                if(statement!=null){
                    statement.close();
                }
            }catch (SQLException e2){
                System.out.println("Error when close connect : "+e2.getMessage());
            }
        }
        return false;
    }
    private void setParameter(PreparedStatement statement,Object... parameters){
        try {
            for(int i=0;i<parameters.length;i++){
                Object parameter=parameters[i];
                int index=i+1;
                if(parameter instanceof Long ){
                    statement.setLong(index, (Long) parameter);
                }else
                if(parameter instanceof Integer ){
                    statement.setInt(index, (Integer) parameter);
                }else
                if(parameter instanceof String ){
                    statement.setString(index, (String) parameter);
                }else
                if(parameter instanceof Boolean ){
                    statement.setBoolean(index, (Boolean) parameter);
                }else
                if(parameter instanceof Double ){
                     statement.setDouble(index, (Double) parameter);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when set parameter : "+e.getMessage());
        }
    }

}
