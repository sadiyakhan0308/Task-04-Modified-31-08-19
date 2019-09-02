package com.wp.Collection;

public class Employee implements Comparable<Employee> {
	 int eno;
   String ename;
    int sal;
  String des;
  String dept;

  
   
   
   public Employee(int eno, String ename,  String dept, String des, int sal) {
       this.eno = eno;
       this.ename =ename;
       this.dept = dept;
       this.des=des;
       this.sal = sal;
   }


   @Override
	public int compareTo(Employee emp) {

		if(eno>emp.eno){
			return 1;
		}else if(eno<emp.eno){
			return -1;
		}else{
	int n=ename.compareTo(emp.ename);
			return n;
		}
	}
		
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (eno != other.eno)
			return false;
		if (sal != other.sal)
			return false;
		return true;
	}
	
		@Override
		public int hashCode() {
			return eno;
		}
		
		@Override
		public String toString() {
			return "Employee [eno=" + eno + ", ename=" + ename + ",dept=" + dept + ",des=" +des + ", sal=" + sal + "]";
		}

		public int getEno() {
			return eno;
		}
		public void setEno(int eno) {
			this.eno = eno;
		}
		
		
		public int getSal() {
			return sal;
		}
		public String getEname() {
			return ename;
		}


		public void setEname(String ename) {
			this.ename = ename;
		}


		public String getDes() {
			return des;
		}


		public void setDes(String des) {
			this.des = des;
		}


		public String getDept() {
			return dept;
		}


		public void setDept(String dept) {
			this.dept = dept;
		}


		public void setSal(int sal) {
			this.sal = sal;
		}
}

	