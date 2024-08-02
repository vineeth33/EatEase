-- Drop existing tables
DROP TABLE order_item;
DROP TABLE payment;
DROP TABLE orders;
DROP TABLE delivery_personnel;
DROP TABLE menu_item;
DROP TABLE restaurant;
DROP TABLE user_address;
DROP TABLE users;

-- Create users table
CREATE TABLE users (
    user_id VARCHAR2(4) CONSTRAINT user_id_pk PRIMARY KEY,
    username VARCHAR2(20) UNIQUE NOT NULL,
    password VARCHAR2(30) NOT NULL,
    phone_no VARCHAR2(10) NOT NULL,
    email_id VARCHAR2(30),
    CONSTRAINT user_id_check CHECK (user_id LIKE 'U%'),
    CONSTRAINT email_id_check CHECK (email_id LIKE '%@%.com'),
    CONSTRAINT phone_no_check CHECK (LENGTH(phone_no) = 10 AND REGEXP_LIKE(phone_no, '^[0-9]+$'))
);

-- Create user_address table
CREATE TABLE user_address (
    user_id VARCHAR2(4) CONSTRAINT user_id_fk REFERENCES users(user_id),
    door_no VARCHAR2(10),
    street VARCHAR2(50),
    pincode VARCHAR2(6) CONSTRAINT pincode_check CHECK (LENGTH(pincode) = 6 AND REGEXP_LIKE(pincode, '^[0-9]+$'))
);

-- Create restaurant table
CREATE TABLE restaurant (
    restaurant_id VARCHAR2(4) CONSTRAINT restaurant_id_pk PRIMARY KEY,
    restaurant_name VARCHAR2(50) UNIQUE,
    address VARCHAR2(100),
    cuisine_type VARCHAR2(30) CONSTRAINT cuisine_type_check CHECK (cuisine_type IN ('Italian', 'Chinese', 'Indian', 'Mexican', 'American', 'Japanese', 'French', 'Thai', 'Greek', 'Spanish')),
    CONSTRAINT restaurant_id_check CHECK (restaurant_id LIKE 'R%')
);

-- Create menu
CREATE TABLE menu_item (
    item_id VARCHAR2(5) CONSTRAINT item_id_pk PRIMARY KEY,
    restaurant_id VARCHAR2(4) CONSTRAINT restaurant_id_fk REFERENCES restaurant(restaurant_id),
    item_name VARCHAR2(50),
    price FLOAT,
    CONSTRAINT menu_item_id_check CHECK (item_id LIKE 'M%')
);

-- Create delivery_personnel table
CREATE TABLE delivery_personnel (
    dp_id VARCHAR2(4) CONSTRAINT dp_id_pk PRIMARY KEY,
    vehicle_no VARCHAR2(15) CONSTRAINT vehicle_no_unique UNIQUE,
    availability VARCHAR2(20) CONSTRAINT availability_check CHECK (availability IN ('Available', 'Unavailable')),
    dp_name VARCHAR2(50),
    dp_no NUMBER(10) CONSTRAINT dp_no_unique UNIQUE,
    CONSTRAINT dp_id_check CHECK (dp_id LIKE 'D%')
);

-- Create orders table
CREATE TABLE orders (
    order_id VARCHAR2(4),
    user_id VARCHAR2(4) CONSTRAINT orders_user_id_fk REFERENCES users(user_id),
    restaurant_id VARCHAR2(4) CONSTRAINT orders_restaurant_id_fk REFERENCES restaurant(restaurant_id),
    dp_id VARCHAR2(4) CONSTRAINT orders_dp_id_fk REFERENCES delivery_personnel(dp_id),
    order_time TIMESTAMP,
    delivery_time TIMESTAMP,
    payment_id VARCHAR2(4),
    status VARCHAR2(10) CONSTRAINT status_check CHECK (status IN ('Preparing', 'Delivered')),
    CONSTRAINT order_payment_id_pk PRIMARY KEY (order_id),
    CONSTRAINT order_id_check CHECK (order_id LIKE 'O%')
);

-- Create payment table
CREATE TABLE payment (
    payment_id VARCHAR2(4) CONSTRAINT payment_id_pk PRIMARY KEY,
    amount NUMBER,
    payment_date DATE,
    CONSTRAINT payment_id_check CHECK (payment_id LIKE 'P%')
);

-- Create order_item table
CREATE TABLE order_item (
    order_id VARCHAR2(4),
    item_id VARCHAR2(4),
    quantity NUMBER,
    CONSTRAINT order_item_order_id_fk FOREIGN KEY (order_id) REFERENCES orders(order_id),
    CONSTRAINT order_item_item_id_fk FOREIGN KEY (item_id) REFERENCES menu_item(item_id)
);

-- Insert data into users table
INSERT INTO users (user_id, username, password, phone_no, email_id) VALUES ('U001', 'vishal', 'pass', '9876543210', 'vishal@gmail.com');

-- Insert data into user_address table
INSERT INTO user_address (user_id, door_no, street, pincode) VALUES ('U001', '106', 'Sreepathy Nagar', '641036');

-- Insert data into restaurant table
INSERT INTO restaurant (restaurant_id, restaurant_name, address, cuisine_type) VALUES ('R001', 'Spice Garden', '12 MG Road', 'Indian');
INSERT INTO restaurant (restaurant_id, restaurant_name, address, cuisine_type) VALUES ('R002', 'Bamboo House', '34 Brigade Road', 'Chinese');
INSERT INTO restaurant (restaurant_id, restaurant_name, address, cuisine_type) VALUES ('R003', 'Pizza Planet', '56 Commercial Street', 'Italian');
INSERT INTO restaurant (restaurant_id, restaurant_name, address, cuisine_type) VALUES ('R004', 'Taco Bell', '78 Residency Road', 'Mexican');
INSERT INTO restaurant (restaurant_id, restaurant_name, address, cuisine_type) VALUES ('R005', 'Burger King', '90 Church Street', 'American');
INSERT INTO restaurant (restaurant_id, restaurant_name, address, cuisine_type) VALUES ('R006', 'Sushi Express', '123 Richmond Road', 'Japanese');

-- Insert data into menu_item table
-- Spice Garden (Indian)
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M001', 'R001', 'Butter Chicken', 299.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M002', 'R001', 'Paneer Tikka Masala', 249.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M003', 'R001', 'Biryani', 199.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M004', 'R001', 'Naan', 50.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M005', 'R001', 'Samosa', 30.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M006', 'R001', 'Mango Lassi', 60.00);

-- Bamboo House (Chinese)
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M007', 'R002', 'Sweet and Sour Chicken', 299.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M008', 'R002', 'Kung Pao Chicken', 329.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M009', 'R002', 'Fried Rice', 179.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M010', 'R002', 'Spring Rolls', 99.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M011', 'R002', 'Dumplings', 149.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M012', 'R002', 'Hot and Sour Soup', 129.00);

-- Pizza Planet (Italian)
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M013', 'R003', 'Margherita Pizza', 249.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M014', 'R003', 'Pepperoni Pizza', 299.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M015', 'R003', 'Spaghetti Carbonara', 279.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M016', 'R003', 'Lasagna', 299.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M017', 'R003', 'Tiramisu', 149.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M018', 'R003', 'Bruschetta', 129.00);

-- Taco Bell (Mexican)
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M019', 'R004', 'Tacos', 149.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M020', 'R004', 'Burritos', 199.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M021', 'R004', 'Quesadillas', 179.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M022', 'R004', 'Nachos', 129.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M023', 'R004', 'Enchiladas', 199.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M024', 'R004', 'Guacamole', 99.00);

-- Burger King (American)
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M025', 'R005', 'Cheeseburger', 149.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M026', 'R005', 'Whopper', 249.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M027', 'R005', 'French Fries', 79.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M028', 'R005', 'Chicken Nuggets', 129.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M029', 'R005', 'Coke', 50.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M030', 'R005', 'Milkshake', 99.00);

-- Sushi Express (Japanese)
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M031', 'R006', 'California Roll', 199.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M032', 'R006', 'Tempura', 249.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M033', 'R006', 'Miso Soup', 99.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M034', 'R006', 'Sashimi', 299.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M035', 'R006', 'Teriyaki Chicken', 279.00);
INSERT INTO menu_item (item_id, restaurant_id, item_name, price) VALUES ('M036', 'R006', 'Edamame', 89.00);

-- Insert data into delivery_personnel table
INSERT INTO delivery_personnel (dp_id, vehicle_no, availability, dp_name, dp_no) VALUES ('D001', 'KA01AB1234', 'Available', 'Rajesh Kumar', 9876543210);
INSERT INTO delivery_personnel (dp_id, vehicle_no, availability, dp_name, dp_no) VALUES ('D002', 'KA02CD5678', 'Available', 'Suresh Gupta', 8765432109);
INSERT INTO delivery_personnel (dp_id, vehicle_no, availability, dp_name, dp_no) VALUES ('D003', 'KA03EF9012', 'Available', 'Anil Mehta', 7654321098);
INSERT INTO delivery_personnel (dp_id, vehicle_no, availability, dp_name, dp_no) VALUES ('D004', 'KA04GH3456', 'Available', 'Kiran Shetty', 6543210987);
INSERT INTO delivery_personnel (dp_id, vehicle_no, availability, dp_name, dp_no) VALUES ('D005', 'KA05IJ7890', 'Available', 'Sunil Verma', 5432109876);
INSERT INTO delivery_personnel (dp_id, vehicle_no, availability, dp_name, dp_no) VALUES ('D006', 'KA06KL1234', 'Available', 'Amit Patel', 4321098765);
INSERT INTO delivery_personnel (dp_id, vehicle_no, availability, dp_name, dp_no) VALUES ('D007', 'KA07MN5678', 'Available', 'Nitin Joshi', 3210987654);
INSERT INTO delivery_personnel (dp_id, vehicle_no, availability, dp_name, dp_no) VALUES ('D008', 'KA08OP9012', 'Available', 'Ravi Naidu', 2109876543);
INSERT INTO delivery_personnel (dp_id, vehicle_no, availability, dp_name, dp_no) VALUES ('D009', 'KA09QR3456', 'Available', 'Vikram Singh', 1098765432);
INSERT INTO delivery_personnel (dp_id, vehicle_no, availability, dp_name, dp_no) VALUES ('D010', 'KA10ST7890', 'Available', 'Arun Reddy', 0987654321);

COMMIT;