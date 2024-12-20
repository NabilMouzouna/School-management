public class ClassRoom {
    public static int roomId;
    private String module;
    private Student[] students;
    private Professor professor;

    public ClassRoom() {
        this.module = null;
        this.students = null;
        this.professor = null;
        roomId++;
    }

    public static int getRoomId() {return roomId;}

    public static void setRoomId(int roomId) {ClassRoom.roomId = roomId;}

    public String getModule() {return module;}

    public void setModule(String module) {this.module = module;}

    public Student[] getStudents() {return students;}

    public void setStudents(Student[] students) {this.students = students;}

    public Professor getProfessor() {return professor;}

    public void setProfessor(Professor professor) {this.professor = professor;}
    
    
}
