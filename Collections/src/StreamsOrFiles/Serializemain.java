package StreamsOrFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Serializemain {
	public static void main(String[] args) throws ClassNotFoundException {
		Employee emp =new Employee();
		emp.setEmpId(115);
		emp.setEmpname("Eswar");
        emp.setEmpDept("Mech");
        emp.setAddress("hyd");
        try{
        	FileOutputStream fileOut =new FileOutputStream("E:\\emp.html");
        	ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
        	outStream.writeObject(emp);
        	outStream.close();
        	fileOut.close();
        	FileInputStream fin = new FileInputStream("E:\\emp.html");
            ObjectInputStream obj = new ObjectInputStream(fin);
            Employee e1 = (Employee)obj.readObject();
            System.out.println(e1.getEmpname());
            System.out.println(e1.getEmpDept());
            System.out.println(e1.getAddress());
        }
        catch(IOException e){
        	e.printStackTrace();
        	
        }
	}
	
      	 
	
	
}

	class Employee implements Serializable {

		private int empId;
		private String empname;
		private String empDept;
		transient private String Address;
		public Employee(){
			
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}

		public String getEmpDept() {
			return empDept;
		}

		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}
	}

	

