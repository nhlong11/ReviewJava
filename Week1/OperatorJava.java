package Week1;

public class OperatorJava {
    public int add(int a , int b){
        return a + b ;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiple(int a, int b){
        return a * b;
    }

    public int quotient (int a, int b){
        if( b != 0 ){
            return a / b;
        }
        return 0;
    }

    public int modulo (int a, int b){
        if(b != 0){
            return a % b;
        }
        return  0;
    }

    public void compare (int a, int b){
        if( a > b){
            System.out.println("A lớn hơn B");
        }

        if ( b > a ){
            System.out.println("B lơn hơn A");
        }

        if ( b == a ){
            System.out.println("A bằng B");
        }

        if ( a >= b ){
            System.out.println("A lớn hơn hoặc bằng B");
        }

        if ( a <= b){
            System.out.println("A bé hơn hoặc bằng B");
        }

    }


    public void main(String[] args){
        OperatorJava operatorJava = new OperatorJava();
        int a =  operatorJava.add(13, 14);
        int b =  operatorJava.subtract(13, 14);
        int c = operatorJava.multiple(13, 14);
        int d =   operatorJava.quotient(13, 14);
        int e =operatorJava.modulo(13, 14);

        System.out.println("Các giá trị tính toán lần lượt là:" + a +""
                + b +" "+ c +" "+d +" "+ e +" "
        );

        operatorJava.compare(13, 14);
        operatorJava.compare(14, 12);
        operatorJava.compare(14, 14);

    }
}
