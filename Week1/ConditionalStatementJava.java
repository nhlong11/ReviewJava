package Week1;

public class ConditionalStatementJava {

    public void main(String[] args){
        int x = 1 ;
        switch ( x ){
            case 1: System.out.println("Giá trị của x là: "+ 1 );
            case 2: System.out.println("Giá trị của x là: "+ 2);
        }

        for( int i = 0 ; i < x ; i++){
            if( i == 3 ){
                return;
            } else if ( i == 2 ){
                break;
            }
            else{
                System.out.println("Giá trị của i là: "+ i);
            }
        }

        while (x > 0 ){
            System.out.println("Giá trị của x là: "+ x);
            x--;
        }

        do {
            System.out.println("Giá trị của x là:"+ x);
            x++;
        }
        while (x< 10);

    }
}
