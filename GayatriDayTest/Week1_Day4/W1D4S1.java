class School{
  public void NameOfTheSchool(){
    System.out.println("Power House");
  }
}

class student extends School {
    public void NameOfTheStudent(){
        System.out.println("Puravi Mishra");
    }
}

class MainTest{
    public ststic void main(String args[]){
        student st = new student();
        st.NameOfTheSchool();
        st.NameOfTheStudent();
    }
}