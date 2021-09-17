CREATE TABLE Mobile_Specification(
    Spec_No VARCHAR(10),
    Dimension VARCHAR(20),
    Wright VARCHAR(20),
    Display_Type VARCHAR(20),
    Display_Size VARCHAR(20),
    Internal_mem_in_MB NUMBER(10),
    Memoty_Card_Capacity_GB NUMBER(10),
    Netword_3G VARCHAR(5),
    GPRS VARCHAR(5),
    EDGE VARCHAR(5),
    Bluetooth VARCHAR(5),
    Camera VARCHAR(5),
    Camera_Quality VARCHAR(5),
    OS VARCHAR(20),
    Battery_Life_Hrs NUMBER(10),
    CONSTRAINT PK PRIMARY KEY(Spec_No)
);