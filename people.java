class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void talk() {
        System.out.println("Hello");
    }

    public void talk(String name) {
        System.out.println("Hello from the otherside " + name + ". This is ypur teacher speaking");
    }
}

class Teacher extends Person {
    private String department;
    private String specialization;

    public Teacher(String name, int age, String department, String specialization) {
        super(name, age);
        this.department = department;
        this.specialization = specialization;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getSpecializatino() {
        return this.specialization;
    }
}

class Student extends Person {
    private int rollNo;
    private String course;
    private String department;

    public Student(String name, int age, int rollNo, String course, String department) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
        this.department = department;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public String getCourse() {
        return this.course;
    }

    public String getDepartment() {
        return this.department;
    }
}

class People {
    public static void main(String[] args) {
        Student student = new Student("Abcd Efgh", 20, 43, "CS", "CSE");
        Teacher teacher = new Teacher("Ijkl Mnop", 43, "CSE", "DSA");

        System.out.println("Student Info: ");
        System.out.println(student.getName() + " " + student.getRollNo());

        System.out.println("Teacher Info: ");
        System.out.println(teacher.getName() + " " + teacher.getSpecializatino());

        System.out.println("Updating Data");

        student.setRollNo(50);
        teacher.setSpecialization("ALGO");

        System.out.println("Student Info: ");
        System.out.println(student.getName() + " " + student.getRollNo());

        System.out.println("Teacher Info: ");
        System.out.println(teacher.getName() + " " + teacher.getSpecializatino());

        student.talk();
        teacher.talk(student.getName());
    }
}