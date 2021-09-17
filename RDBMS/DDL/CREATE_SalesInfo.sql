CREATE TABLE Sales_Info(
    SalesId NUMBER(10) PRIMARY KEYm
    Sales_Date DATE,
    IME_No VARCHAR(10) REFERENCES Mobile_Master(IME_No),
    Price NUMBER(10),
    Discount NUMBER(10),
    Net_Amount NUMBER(10),
    Customer_ID VARCHAR(10) REFERENCES Customer_Info(Customer_ID)
);