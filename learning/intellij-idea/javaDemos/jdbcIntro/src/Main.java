import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        DbHelper helper = new DbHelper ();

        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection ( );
            // System.out.println ( "Connection ready." );

            // create sql query -- select Code, Name, Continent, Region from country
            statement = connection.createStatement ();
            resultSet = statement.executeQuery ("select Code, Name, Continent, Region from country");

            while (resultSet.next ()){
                System.out.println ( resultSet.getString ("Name") );
            }

        } catch (SQLException exception) {
            // System.out.println (exception.getMessage ());
            helper.showErrorMessage (exception);
        } finally {
                connection.close ();
        }

    }
}
