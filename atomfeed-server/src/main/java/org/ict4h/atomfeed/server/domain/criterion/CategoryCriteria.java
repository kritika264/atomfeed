package org.ict4h.atomfeed.server.domain.criterion;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoryCriteria implements Criterion{
    private final String category;

    public CategoryCriteria(String category) {
        this.category = category;
    }

    @Override
    public String asSqlString() {
        return "where category = ?";
    }

    @Override
    public PreparedStatement prepareStatement(PreparedStatement statement) throws SQLException {
        statement.setString(1, category);
        return statement;
    }
}
