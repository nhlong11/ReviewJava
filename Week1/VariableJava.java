package Week1;

public class VariableJava {
    private int globalVariable;

    private static int staticVariable = 15;

    VariableJava(){
    }

    public VariableJava(int globalVariable){
        this.globalVariable = globalVariable;
    }

    public void showGlobalVariable(){
        System.out.println("Đây là biến toàn cục " + this.globalVariable);
    }

    public void setGlobalVariable(int newGlobalVariable){
        this.globalVariable = newGlobalVariable;
    }

    public int localVariable(){
        int localNumber = 23;
       return localNumber;
    }

    public void setStaticVariable(int staticVariable) {
        this.staticVariable = staticVariable;
    }


    public static void main(String[] args) {
        // Code của bạn ở đây
        System.out.println("Hello, World!");


        VariableJava variableJava = new VariableJava();
        VariableJava variableJava1 = new VariableJava();

        // 1. Biến cục bộ ( local variable)
        int localNumber = variableJava.localVariable();
        System.out.println("Đây là biến cục bộ " + localNumber );

        // 2. Biên toàn cục (global variable)
        variableJava.setGlobalVariable(localNumber + 1);
        variableJava.showGlobalVariable();

        //3. Biến tĩnh ( static variable)
        System.out.println("Đây là biến tĩnh "+ VariableJava.staticVariable);
        variableJava1.setStaticVariable(VariableJava.staticVariable + 1);
        System.out.println("Đây là biến tĩnh "+ VariableJava.staticVariable);
        variableJava.setStaticVariable(VariableJava.staticVariable + 1);

        // Giá trị trả về là 17 -> thay đổi đôi tượng nhưng giá trị static vẫn được tăng -> có thể chia sẽ giữa các đối tượng
        System.out.println("Đây là biến tĩnh "+ VariableJava.staticVariable);
    }
    /** Biến cục bộ**/
    /*
    * Phạm vị trong phương thức hoặc trong khối mã
    * Thời gian sống khi phương thức hoặc khối mã kết thúc -> biến bị hủy
    * Không có giá trị mặc định
    * Không chia sẽ được giữa các đối tượng
    */

    /** Biến toàn cục **/
    /*
    * Phạm vị trong toàn bộ lớp
    * Thời gian sống tồn tại suốt vòng đời của chương trình
    * Truy cập thông qua đối tượng
    * Có giá trị mặc định (0, null, v.v.)
    *  Không chia sẽ được giữa các đối tượng
    * */

    /** Biến tĩnh **/
    /*
     * Phạm vị trong toàn bộ lớp
     * Tồn tại suốt vòng đời của chương trình
     * Truy cập trực tiếp thông qua lớp
     * Có giá trị mặc định (0, null, v.v.)
     * Có thể chia sẽ giữa các đối tượng
     * */
}
