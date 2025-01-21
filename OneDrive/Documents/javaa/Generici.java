interface Keyvalue<K,V>
{
  K getk();
  V getv();
}
class Generici<K,V> implements Keyvalue<K,V>
{
  K key;
  V val;
  Generici(K key,V val)
  {
    this.key=key;
    this.val=val;
  }
  public K getk()
  {
     return key;
  }
  public V getv()
  {
     return val;
  }
  public static void main(String[] args)
  {
    Generici<Integer,String> obj1=new Generici<>(1,"pandu");
    System.out.println(obj1.getk());
    System.out.println(obj1.getv());
  }
}