class Main {
  public static void main(String[] args) {
    Clock clock = new Clock(0,00);
    System.out.println(clock);
    while(true){
      try{
        Thread.sleep(1000);
        clock.tick();
        System.out.println(clock);
      }
      catch(Exception e){}
    }
  }
}
