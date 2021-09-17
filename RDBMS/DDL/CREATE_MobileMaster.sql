CREATE TABLE Mobile_Master(
    IME_No VARCHAR(10) PRIMARY KEY,
    Model_Name VARCHAR(20),
    Manufacturer VARCHAR(20),
    Date_of_Manufac DATE, 
    Warranty_In_Years NUMBER(10),
    Price NUMBER(7, 2);
    Distributor_ID VARCHAR(10),
    Spec_No VARCHAR(10),
    FOREIGN KEY Distributor_ID REFERENCES Distributor(Distributor_ID),
    FOREIGN KEY Spec_No REFERENCES Mobile_Specification(Spec_No)
);