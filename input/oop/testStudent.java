package input.oop;

public class testStudent {
    public static void main(String[] args) {
        student st = new student();
        st.name = "Zahid Hasan Juel";
        st.gender = "male";
        st.dept = "CSE";
        st.id = 181;

        System.out.println(st.name);
        System.out.println(st.id);
        System.out.println(st.dept);
        System.out.println(st.gender);
    }
}
