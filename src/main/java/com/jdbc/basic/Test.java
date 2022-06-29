package com.jdbc.basic;

import java.sql.Connection;
import java.sql.SQLException;

import static oracle.sql.DatumWithConnection.assertNotNull;

public class Test {

    public static void main(String[] args) throws SQLException {

        Connection conn = Connect.makeConnection();
        if (conn != null) {
            System.out.println("연결 성공!");
        } else {
            System.out.println("연결 실패!");
        }

        assertNotNull(conn);  // 나는 conn 이 null 아닌것을 단언한다.
    }
}
