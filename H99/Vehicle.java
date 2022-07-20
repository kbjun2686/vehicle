package H99;

class vehicle {
     final int num;     //번호
    static int fuel=100;      //기름
    static int speed;      //속도
    int speedChange=30;         //속도변경
    int maxPeople=30;          //최대 승객수
    boolean condition=false;      //true면 운행출력,false면 차고지행 출력

    int passenger;

    int restPep=0;
    public vehicle(int num){
        this.num=num;
        this.fuel=fuel;
        this.speed=speed;
        this.speedChange=speedChange;
        this.maxPeople=maxPeople;
        this.condition=condition;
        this.passenger=passenger;

    }

    public void ridePeople(int passenger) {
        if (0 < passenger) {
                restPep+=passenger;
            }
            System.out.println("승객 탑승: " + this.restPep);
        }

    void setspeedChange(int speed){
        this.speed=0;
        System.out.println("현재 속도: "+this.speed);
        System.out.println("변경할 속도: "+this.speedChange);
        this.speed+=speedChange;
        System.out.println("변경된 속도 : "+this.speed);
    }

// 테스트중입니다
}
 class bus extends vehicle{
    public bus(int n){
        super(n);


    }
 }

 class S{
    public static void main(String[] args){
        vehicle v= new vehicle(1);
        vehicle v2=new vehicle(2);
        vehicle v3=new vehicle(3);
        vehicle v4=new vehicle(4);

    }

        }