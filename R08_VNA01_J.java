final class Foo {
  private Helper helper;
 
  public Helper getHelper() {
    return helper;
  }
 
  public void setHelper(int num) {
    helper = new Helper(num);
  }
}