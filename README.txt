kế hoạch demo dockerfile

- Từ dockerfile build image, image run thành các container chứa môi trường và công cụ để chạy được app java và mysql.

- Các bước thực hiện:

 + Từ dockerfile_mysql build image db_mysql, run image lên để được container chứa mysql. Sau đó tạo bảng employees và insert một vài dữ liệu.
	// Tạo Table: CREATE TABLE employees(id INT, empName VARCHAR(200), salary DOUBLE);
	// Insert dữ liệu: INSERT INTO employees(id, emp_name, salary) VALUES (1, "employee1", 10000), (2, "employee2", 20000) ,(3, "employee3", 30000), (4, "employee4", 40000), (5, "employee5", 50000);
 
 + Từ dockerfile_environment_java build thành image environment_java, và run image để được container chạy app java.
 
 + Từ dockerfile_onbuild chúng ta run thành image demo_onbuild để thấy chức năng của directive ONBUILD.