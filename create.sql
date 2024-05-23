-- Create Person Table
CREATE TABLE Person (
    PersonID SERIAL PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50),
    Gender CHAR(1),
    DateOfBirth DATE,
    DateOfDeath DATE,
    PlaceOfBirth VARCHAR(100),
    PlaceOfDeath VARCHAR(100)
);

-- Create Relationship Table
CREATE TABLE Relationship (
    RelationshipID SERIAL PRIMARY KEY,
    Person1_ID INT NOT NULL,
    Person2_ID INT NOT NULL,
    RelationshipType VARCHAR(50) NOT NULL,
    FOREIGN KEY (Person1_ID) REFERENCES Person(PersonID),
    FOREIGN KEY (Person2_ID) REFERENCES Person(PersonID)
);

-- Optional: Create Event Table
CREATE TABLE Event (
    EventID SERIAL PRIMARY KEY,
    PersonID INT NOT NULL,
    EventType VARCHAR(50) NOT NULL,
    EventDate DATE,
    Location VARCHAR(100),
    Description TEXT,
    FOREIGN KEY (PersonID) REFERENCES Person(PersonID)
);

-- Optional: Create Attribute Table
CREATE TABLE Attribute (
    AttributeID SERIAL PRIMARY KEY,
    PersonID INT NOT NULL,
    AttributeType VARCHAR(50) NOT NULL,
    Value TEXT,
    FOREIGN KEY (PersonID) REFERENCES Person(PersonID)
);
