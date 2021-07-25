import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        DbHelper helper = new DbHelper ();

        PreparedStatement statement = null;

        try {
            connection = helper.getConnection ( );
            String sql = "insert into city(Name, CountryCode, District, Population) " +
                    "values (?, ?, ?, ?)";  // user input values
            statement = connection.prepareStatement (sql);
            statement.setString (1,"Düzce2");
            statement.setString (2,"TUR");
            statement.setString (3,"Düzce");
            statement.setInt (4,100000);
            // statement.executeUpdate ();
            int result = statement.executeUpdate ();
            System.out.println ( "City added." );

        } catch (SQLException exception) {
            helper.showErrorMessage (exception);

        } finally {
            statement.close ();
            connection.close ();
        }
    }

    public static void selectDemo() throws SQLException {
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

            ArrayList<Country> countries = new ArrayList<Country> (  );

            while (resultSet.next ()){
                // System.out.println ( resultSet.getString ("Name") );
                countries.add (new Country (
                        resultSet.getString ("Code"),
                        resultSet.getString ("Name"),
                        resultSet.getString ("Continent"),
                        resultSet.getString ("Region")));
            }
            System.out.println ( countries.size () );  // check point

        } catch (SQLException exception) {
            // System.out.println (exception.getMessage ());
            helper.showErrorMessage (exception);

        } finally {
            connection.close ();
        }
    }
}
