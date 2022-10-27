package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute extends Main {

    public Connection connection;
    public Execute(Connection c){connection = c;}

    public void execute(){
        String query = "select book_name Book, concat(f_name, l_name) Author, pub_year 'Year' from library.books b join library.authors a on b.id_author=a.id_author;";
        final int  x_cells = 5, y_cells=3;
        System.out.println("111");

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            String[][] table_out = new String[x_cells+1][y_cells];

            table_out[0][0] = "Book";
            table_out[0][1] = "Author";
            table_out[0][2] = "Year";

            System.out.println("========books_authors=======");

            int i=0, j=0;

            while (resultSet.next() && i <= x_cells && j < y_cells){



                table_out[i][j] = resultSet.getString(1);
                j++;

                table_out[i][j] = resultSet.getString(2);
                j++;

                table_out[i][j] = resultSet.getString(3);
                System.out.println(table_out[i][j-2] + "|\t|" + table_out[i][j-1] + "|\t|" + table_out[i][j]);

                j=0;
                i++;


            }

        } catch (SQLException e1){
            e1.printStackTrace();
        }
    }

}
