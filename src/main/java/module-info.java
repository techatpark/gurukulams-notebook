module gurukulams.notebook {
    requires java.base;
    requires java.sql;
    requires java.naming;
    requires org.json;
    requires org.postgresql.jdbc;
    requires jakarta.validation;
    requires org.hibernate.validator;
    requires com.h2database;
    requires com.fasterxml.jackson.databind;

    opens com.gurukulams.notebook.service;

    exports com.gurukulams.notebook.service;
    exports com.gurukulams.notebook.model;
}