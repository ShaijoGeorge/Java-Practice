class Student 
{
    private String name;
    public Student()
    {
        this.name = "Unknown";
    }
    public Student(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public static void main(String[] args)
    {
        Student student1 = new Student();
        Student student2 = new Student("John");
        System.out.println(student1.getName());
        System.out.println(student2.getName());
    }
}