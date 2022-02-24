CREATE TABLE person
(
    id         RAW(16) NOT NULL,
    first_name VARCHAR2(255),
    last_name  VARCHAR2(255),
    CONSTRAINT pk_person PRIMARY KEY (id)
);

CREATE TABLE house
(
    id             RAW(16)       NOT NULL,
    owner_id       RAW(16),
    street         VARCHAR2(255) NOT NULL,
    house_number        INTEGER       NOT NULL,
    apartment      VARCHAR2(255),
    price_currency VARCHAR2(255),
    price_value    DECIMAL(19, 2),
    CONSTRAINT pk_house PRIMARY KEY (id)
);

ALTER TABLE house
    ADD CONSTRAINT FK_HOUSE_ON_OWNER FOREIGN KEY (owner_id) REFERENCES person (id);