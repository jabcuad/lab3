import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
//@Test
  public void testmerge() {
    List<String> input1 = new ArrayList<>();
    input1.add("apple");
    List<String> input2 = new ArrayList<>();
    input2.add("bear");
    input2.add("car");
    List<String> expected=new ArrayList<>();
    expected.add("apple");
    expected.add("bear");
    expected.add("car");
    assertEquals(expected, ListExamples.merge(input1,input2));
  }
//
  @Test
  public void testfilter(){
    List<String>input=new ArrayList<>();
    input.add("add");
    input.add("lol");
    List<String>result=new ArrayList<>();
    result.add("add");
    result.add("lol");
    CheckString sss =new CheckString();
    assertEquals(result, ListExamples.filter(input,sss));
  }
}
