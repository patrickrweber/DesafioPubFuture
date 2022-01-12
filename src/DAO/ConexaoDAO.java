/*
 * The MIT License
 *
 * Copyright 2022 Patrick Renan Weber.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
/**
 *
 * @author Patrick Renan Weber
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Conexão com o banco de dados
 *
 * @author Patrick Renan Weber
 */
public class ConexaoDAO {

    /**
     * Método responsável pela conexão com o banco de dados
     *
     * @return conexao
     */
    public Connection conectaBD() {     
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/desafiopubfutureder?user=publica&password=";
            conexao = DriverManager.getConnection(url);     

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + e.getMessage());
        }
        return conexao;
    }
}
