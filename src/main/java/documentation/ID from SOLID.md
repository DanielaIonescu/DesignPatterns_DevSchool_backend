S - Single responsibility principle (a class should have one and only one reason to change)

O - Open-Closed principle (Open for extension, closed for modification)

L - Liskov substitution (Subtypes can replace their types)

I - Interface Segregation Principle (Clients should not be forced to implement interfaces they do not use.)

D - Dependency Inversion Principle (Entities must depend on abstractions, not on concretions.)

###Interface Segregation Principle
A client should never be forced to implement an interface that it doesn't use, or clients shouldn't be forced to depend on methods they do not use.

It simply means that larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

Simple example:

    interface ShapeInterface
    {
        public function area();

        public function volume();
    }

    class Cuboid implements ShapeInterface{...}
    class Square implements ShapeInterface{...}

Recommendation of implementation:

    interface ShapeInterface
    {
        public function area();
    }

    interface ThreeDimensionalShapeInterface
    {
        public function volume();
    }

###Dependency Inversion Principle

Entities must depend on abstractions, not on concretions. 
It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.

Simple example:

    class MySQLConnection {
        public String connect() {
                // handle the database connection
                return 'Database connection';
            }
    }
    
    class PasswordReminder {
        private MySQLConnection dbConnection;

        public PasswordReminder(MySQLConnection dbConnection) {
            this.dbConnection = dbConnection;
        }
    }

Recommendation of implementation:

    interface DBConnectionInterface {
        public function connect();
    }
    
    class MySQLConnection implements DBConnectionInterface {
        public function connect() {
            // handle the database connection
            return 'Database connection';
        }
    }

    class PasswordReminder {
        private DBConnectionInterface dbConnection;

        public PasswordReminder(DBConnectionInterface dbConnection)
        {
            this.dbConnection = dbConnection;
        }
    }

