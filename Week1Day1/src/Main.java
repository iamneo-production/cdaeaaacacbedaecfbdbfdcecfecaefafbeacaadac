// You are using Java
class School {
    public void myschool(){
        System.out.println("This is my school");
    }
    
}

class student extends School {
    public void mystudent(){
        System.out.println("They are my students");
    }
}

class Main1{
    public static void main(String args[]){
        student st = new student();
        st.myschool();
        st.mystudent();
    }
}