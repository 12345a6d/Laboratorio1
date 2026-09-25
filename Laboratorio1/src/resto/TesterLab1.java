/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//----------------------------------------------------------------------
//
// File generated at: 2026/9/24 -- 18:30:38
// Seed: {1790,267437,257267}
//
//----------------------------------------------------------------------



package resto;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterLab1 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    TestData.setIndividualTimeout(10) ;
    TestData.setGlobalTimeout(60) ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(53,TestData.getGlobalTimeout()) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(4,0,0) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_01")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_01")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_02")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_02")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_03")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED2026"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new ToString(v_1).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_03")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_04")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Etxebarria Marti"),new String("2222222"),new String("3S1T-MI"),3.00000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_04")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_05")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Marti Pujol"),new String("2222222"),new String("3S1T-MI"),7.00000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_05")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_06")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Soler Suarez"),new String("3333333"),new String("3S1M-ADE"),1.00000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_06")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_07")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Lopez Suarez"),new String("2222222"),new String("3S1M-ADE"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Jordi Lopez Suarez"),new String("2222222"),new String("3S1M-ADE"),1.00000000000000000000e+01) })) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Jordi Lopez Suarez"),new String("2222222"),new String("3S1M-ADE"),9.25000000000000000000e+00)).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_07")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_08")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Suarez Pujol"),new String("3333333"),new String("3S1T-MI"),4.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Juan Suarez Pujol"),new String("3333333"),new String("3S1T-MI"),7.75000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Soler Sanchez"),new String("5555555"),new String("3S1T"),6.75000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_08")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_09")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Gonzalez Soler"),new String("1111111"),new String("3S1T-MI"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Maria Gonzalez Soler"),new String("1111111"),new String("3S1T-MI"),9.75000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Sanchez Pujol"),new String("5555555"),new String("3S1M-ADE"),7.50000000000000000000e-01).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_09")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_10")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Marti Aguirre"),new String("2222222"),new String("3S1T"),0.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Roi Marti Aguirre"),new String("2222222"),new String("3S1T"),0.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Roi Marti Aguirre"),new String("2222222"),new String("3S1T"),0.00000000000000000000e+00)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_10")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_11")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Marti Suarez"),new String("3333333"),new String("3S2T-B"),7.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Soler Gonzalez"),new String("1111111"),new String("3S1M-ADE"),8.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Marti Lopez"),new String("2222222"),new String("3S1T-MI"),4.50000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_11")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_12")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Puig Sanchez"),new String("2222222"),new String("3S1M-ADE"),2.50000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Marti Marti"),new String("4444444"),new String("3S1M-ADE"),5.00000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Lopez Sanchez"),new String("5555555"),new String("3S1T-MI"),3.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Aguirre Aguirre"),new String("5555555"),new String("3S1T-MI"),1.00000000000000000000e+01).doCall().checkResult(new IllegalStateException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_12")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_13")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Pujol Etxebarria"),new String("4444444"),new String("3S1M-ADE"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Etxebarria Perez"),new String("2222222"),new String("3S2T-B"),5.00000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Gonzalez Marti"),new String("4444444"),new String("3S1T"),2.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Gonzalez Fernandez"),new String("5555555"),new String("3S1T"),2.75000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_13")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_14")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Marti Etxebarria"),new String("5555555"),new String("3S1T"),4.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Marti Perez"),new String("4444444"),new String("3S1T-MI"),5.00000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Sanchez Lopez"),new String("2222222"),new String("3S1T"),9.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Pablo Marti Etxebarria"),new String("5555555"),new String("3S1T"),4.75000000000000000000e+00)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_14")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_15")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Marti Sanchez"),new String("4444444"),new String("3S2T-B"),9.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Fernandez Soler"),new String("3333333"),new String("3S1T-MI"),5.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Pujol Suarez"),new String("3333333"),new String("3S1M-ADE"),3.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_15")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_16")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Pujol Suarez"),new String("4444444"),new String("3S1T"),8.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Daniel Pujol Suarez"),new String("4444444"),new String("3S1T"),3.75000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("4444444")).doCall().checkResult(new Calificacion(new String("Daniel Pujol Suarez"),new String("4444444"),new String("3S1T"),3.75000000000000000000e+00)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_16")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_17")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Soler Pujol"),new String("5555555"),new String("3S1T"),6.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Luis Soler Pujol"),new String("5555555"),new String("3S1T"),6.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Luis Soler Pujol"),new String("5555555"),new String("3S1T"),7.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Soler Suarez"),new String("3333333"),new String("3S1M-ADE"),7.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Perez Etxebarria"),new String("6666666"),new String("3S1M-ADE"),5.25000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_17")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_18")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Sanchez Pujol"),new String("2222222"),new String("3S2T-B"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Aguirre Etxebarria"),new String("1111111"),new String("3S1T-MI"),9.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("1111111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Perez Aguirre"),new String("6666666"),new String("3S1T-MI"),5.25000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_18")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_19")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Puig Soler"),new String("5555555"),new String("3S1M-ADE"),5.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Jorge Puig Soler"),new String("5555555"),new String("3S1M-ADE"),9.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Fernandez Lopez"),new String("3333333"),new String("3S1T-MI"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Marti Pujol"),new String("5555555"),new String("3S1T"),0.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_19")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_20")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Aguirre Marti"),new String("3333333"),new String("3S1T"),6.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Juan Aguirre Marti"),new String("3333333"),new String("3S1T"),6.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Juan Aguirre Marti"),new String("3333333"),new String("3S1T"),6.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Puig Aguirre"),new String("3333333"),new String("3S2T-B"),3.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_20")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_21")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Suarez Suarez"),new String("6666666"),new String("3S1T-MI"),4.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.25000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.25000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Etxebarria Pujol"),new String("6666666"),new String("3S2T-B"),1.00000000000000000000e+01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Puig Soler"),new String("1111111"),new String("3S1M-ADE"),2.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("6666666")).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_21")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_22")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Aguirre Etxebarria"),new String("6666666"),new String("3S1M-ADE"),3.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Marti Gonzalez"),new String("1111111"),new String("3S1M-ADE"),7.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),2)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Jorge Aguirre Etxebarria"),new String("6666666"),new String("3S1M-ADE"),3.00000000000000000000e+00),new Calificacion(new String("Ainhoa Marti Gonzalez"),new String("1111111"),new String("3S1M-ADE"),7.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Jorge Aguirre Etxebarria"),new String("6666666"),new String("3S1M-ADE"),3.00000000000000000000e+00),new Calificacion(new String("Ainhoa Marti Gonzalez"),new String("1111111"),new String("3S1M-ADE"),7.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Jorge Aguirre Etxebarria"),new String("6666666"),new String("3S1M-ADE"),3.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Perez Sanchez"),new String("3333333"),new String("3S1T"),1.00000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_22")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_23")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Marti Lopez"),new String("3333333"),new String("3S1T-MI"),2.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Marti Soler"),new String("4444444"),new String("3S1T-MI"),7.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Etxebarria Lopez"),new String("5555555"),new String("3S1T"),6.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Unai Etxebarria Lopez"),new String("5555555"),new String("3S1T"),3.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Gonzalez Marti"),new String("5555555"),new String("3S1M-ADE"),2.50000000000000000000e-01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Lua Marti Soler"),new String("4444444"),new String("3S1T-MI"),7.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Unai Etxebarria Lopez"),new String("5555555"),new String("3S1T"),1.00000000000000000000e+01)).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_23")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_24")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Soler Gonzalez"),new String("1111111"),new String("3S1T"),5.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Pablo Soler Gonzalez"),new String("1111111"),new String("3S1T"),1.00000000000000000000e+01)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("1111111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Lopez Marti"),new String("2222222"),new String("3S1M-ADE"),3.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Clara Lopez Marti"),new String("2222222"),new String("3S1M-ADE"),3.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Clara Lopez Marti"),new String("2222222"),new String("3S1M-ADE"),3.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_24")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TestResult<ActaNotasImpl,Void> v_2 = null ;
ActaNotasImpl v_3 = null ;
TestResult<ActaNotasImpl,Void> v_4 = null ;
ActaNotasImpl v_5 = null ;
TestResult<ActaNotasImpl,Void> v_6 = null ;
ActaNotasImpl v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_25")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED2026"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Constructor(new String("AED2026"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Constructor(new String("AED2026"),5.00000000000000000000e+00,2025,false).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  v_6 = new Constructor(new String("AED2026"),5.00000000000000000000e+00,2026,true).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Equals(v_1,v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Equals(v_1,v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Equals(v_1,v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Equals(v_1,v_7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Equals(v_5,v_7).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_25")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_26")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Soler Marti"),new String("2222222"),new String("3S2T-B"),9.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Eva Soler Marti"),new String("2222222"),new String("3S2T-B"),9.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Eva Soler Marti"),new String("2222222"),new String("3S2T-B"),6.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Eva Soler Marti"),new String("2222222"),new String("3S2T-B"),6.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Eva Soler Marti"),new String("2222222"),new String("3S2T-B"),6.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Soler Sanchez"),new String("6666666"),new String("3S2T-B"),6.00000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_26")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_27")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Suarez Suarez"),new String("1111111"),new String("3S1M-ADE"),2.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("1111111")).doCall().checkResult(new Calificacion(new String("Jordi Suarez Suarez"),new String("1111111"),new String("3S1M-ADE"),2.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("1111111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Gonzalez Puig"),new String("3333333"),new String("3S1T"),5.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Nerea Gonzalez Puig"),new String("3333333"),new String("3S1T"),5.50000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Nerea Gonzalez Puig"),new String("3333333"),new String("3S1T"),5.50000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Puig Suarez"),new String("2222222"),new String("3S1T"),5.00000000000000000000e-01).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_27")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_28")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Aguirre Marti"),new String("1111111"),new String("3S1T"),7.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Gonzalez Etxebarria"),new String("3333333"),new String("3S1T-MI"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(8.62500000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Puig Gonzalez"),new String("1111111"),new String("3S1T-MI"),8.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Soler Soler"),new String("4444444"),new String("3S1M-ADE"),6.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Sanchez Suarez"),new String("5555555"),new String("3S1T"),8.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Puig Lopez"),new String("1111111"),new String("3S1M-ADE"),3.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_28")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TestResult<ActaNotasImpl,Void> v_2 = null ;
ActaNotasImpl v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_29")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED2026"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Constructor(new String("PROG2"),7.50000000000000000000e+00,2025,false).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Asignatura(v_1).doCall().checkResult(new String("AED2026")) ;
if (ok_sofar)
  ok_sofar = new Asignatura(v_3).doCall().checkResult(new String("PROG2")) ;
if (ok_sofar)
  ok_sofar = new Anyo(v_1).doCall().checkResult(2026) ;
if (ok_sofar)
  ok_sofar = new Anyo(v_3).doCall().checkResult(2025) ;
if (ok_sofar)
  ok_sofar = new MinNotaAprobado(v_1).doCall().checkResult(5.00000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new MinNotaAprobado(v_3).doCall().checkResult(7.50000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new EsConvocatoriaExtraordinaria(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new EsConvocatoriaExtraordinaria(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_29")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_30")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Fernandez Fernandez"),new String("2222222"),new String("3S1T"),8.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Paloma Fernandez Fernandez"),new String("2222222"),new String("3S1T"),3.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Perez Gonzalez"),new String("4444444"),new String("3S1T"),9.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),2)))) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(6.37500000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Jordi Perez Gonzalez"),new String("4444444"),new String("3S1T"),8.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Puig Puig"),new String("1111111"),new String("3S2T-B"),4.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Marti Etxebarria"),new String("3333333"),new String("3S2T-B"),7.50000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Etxebarria Suarez"),new String("6666666"),new String("3S2T-B"),3.00000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_30")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_31")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Lopez Fernandez"),new String("2222222"),new String("3S1M-ADE"),6.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Jordi Lopez Fernandez"),new String("2222222"),new String("3S1M-ADE"),6.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Jordi Lopez Fernandez"),new String("2222222"),new String("3S1M-ADE"),6.00000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Jordi Lopez Fernandez"),new String("2222222"),new String("3S1M-ADE"),3.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Aguirre Etxebarria"),new String("2222222"),new String("3S1T-MI"),3.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Sanchez Lopez"),new String("1111111"),new String("3S1M-ADE"),6.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Puig Perez"),new String("1111111"),new String("3S1M-ADE"),1.00000000000000000000e+01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Perez Soler"),new String("1111111"),new String("3S1M-ADE"),7.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("1111111")).doCall().checkResult(new Calificacion(new String("Ainhoa Sanchez Lopez"),new String("1111111"),new String("3S1M-ADE"),6.25000000000000000000e+00)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_31")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_32")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Gonzalez Gonzalez"),new String("2222222"),new String("3S1T"),6.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(6.00000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Suarez Marti"),new String("2222222"),new String("3S1T"),2.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Lopez Fernandez"),new String("6666666"),new String("3S1M-ADE"),7.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Roi Gonzalez Gonzalez"),new String("2222222"),new String("3S1T"),6.00000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Marti Soler"),new String("2222222"),new String("3S1M-ADE"),7.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Marti Perez"),new String("3333333"),new String("3S2T-B"),2.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Eva Marti Perez"),new String("3333333"),new String("3S2T-B"),2.00000000000000000000e+00),new Calificacion(new String("Roi Gonzalez Gonzalez"),new String("2222222"),new String("3S1T"),6.00000000000000000000e+00),new Calificacion(new String("Jose Lopez Fernandez"),new String("6666666"),new String("3S1M-ADE"),7.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Pujol Gonzalez"),new String("6666666"),new String("3S2T-B"),1.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("6666666")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.00000000000000000000e+00) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_32")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_33")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Puig Soler"),new String("5555555"),new String("3S1T-MI"),5.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Ainhoa Puig Soler"),new String("5555555"),new String("3S1T-MI"),5.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Perez Aguirre"),new String("5555555"),new String("3S1T"),1.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Ainhoa Puig Soler"),new String("5555555"),new String("3S1T-MI"),1.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Fernandez Sanchez"),new String("1111111"),new String("3S1M-ADE"),7.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.37500000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.37500000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Soler Aguirre"),new String("4444444"),new String("3S2T-B"),1.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(3.50000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Ainhoa Puig Soler"),new String("5555555"),new String("3S1T-MI"),3.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Aguirre Pujol"),new String("2222222"),new String("3S2T-B"),7.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_33")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_34")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Gonzalez Marti"),new String("6666666"),new String("3S2T-B"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(1.00000000000000000000e+01) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("6666666")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Fernandez Sanchez"),new String("5555555"),new String("3S2T-B"),1.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(1.75000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Perez Suarez"),new String("2222222"),new String("3S2T-B"),0.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Lua Perez Suarez"),new String("2222222"),new String("3S2T-B"),0.00000000000000000000e+00),new Calificacion(new String("Marc Fernandez Sanchez"),new String("5555555"),new String("3S2T-B"),1.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Montserrat Perez Puig"),new String("4444444"),new String("3S1T-MI"),5.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Montserrat Perez Puig"),new String("4444444"),new String("3S1T-MI"),7.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(2.91666666666666651864e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Suarez Marti"),new String("6666666"),new String("3S1T-MI"),3.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Fernandez Marti"),new String("2222222"),new String("3S1M-ADE"),9.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Montserrat Perez Puig"),new String("4444444"),new String("3S1T-MI"),9.75000000000000000000e+00)).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_34")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_35")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("1111111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Sanchez Marti"),new String("6666666"),new String("3S1M-ADE"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Marc Sanchez Marti"),new String("6666666"),new String("3S1M-ADE"),1.00000000000000000000e+01)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Puig Etxebarria"),new String("3333333"),new String("3S2T-B"),7.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(8.62500000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Marc Sanchez Marti"),new String("6666666"),new String("3S1M-ADE"),7.50000000000000000000e-01)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,null).doCall().checkResult(new IllegalArgumentException()) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.00000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Nerea Puig Etxebarria"),new String("3333333"),new String("3S2T-B"),7.25000000000000000000e+00),new Calificacion(new String("Marc Sanchez Marti"),new String("6666666"),new String("3S1M-ADE"),7.50000000000000000000e-01) })) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("6666666")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Nerea Puig Etxebarria"),new String("3333333"),new String("3S2T-B"),2.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Nerea Puig Etxebarria"),new String("3333333"),new String("3S2T-B"),2.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Montserrat Puig Fernandez"),new String("4444444"),new String("3S2T-B"),8.75000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_35")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_36")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Perez Perez"),new String("3333333"),new String("3S1M-ADE"),1.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(1.50000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Daniel Perez Perez"),new String("3333333"),new String("3S1M-ADE"),1.50000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Fernandez Pujol"),new String("4444444"),new String("3S2T-B"),3.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Fernandez Aguirre"),new String("5555555"),new String("3S2T-B"),4.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Clara Fernandez Pujol"),new String("4444444"),new String("3S2T-B"),2.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Clara Fernandez Pujol"),new String("4444444"),new String("3S2T-B"),9.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Paloma Fernandez Aguirre"),new String("5555555"),new String("3S2T-B"),4.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Paloma Fernandez Aguirre"),new String("5555555"),new String("3S2T-B"),4.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Puig Sanchez"),new String("5555555"),new String("3S1T-MI"),1.00000000000000000000e+01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Clara Fernandez Pujol"),new String("4444444"),new String("3S2T-B"),9.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.91666666666666696273e+00) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.91666666666666696273e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Marti Aguirre"),new String("4444444"),new String("3S1T-MI"),8.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Daniel Perez Perez"),new String("3333333"),new String("3S1M-ADE"),1.50000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Puig Puig"),new String("1111111"),new String("3S1T"),3.50000000000000000000e+00).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_36")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_37")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Soler Gonzalez"),new String("6666666"),new String("3S1M-ADE"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("6666666")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Gonzalez Marti"),new String("5555555"),new String("3S1T-MI"),7.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Perez Soler"),new String("5555555"),new String("3S1M-ADE"),1.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Soler Fernandez"),new String("5555555"),new String("3S1T-MI"),2.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Suarez Puig"),new String("2222222"),new String("3S2T-B"),2.50000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Gonzalez Fernandez"),new String("2222222"),new String("3S2T-B"),8.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Pablo Suarez Puig"),new String("2222222"),new String("3S2T-B"),1.00000000000000000000e+01)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1)))) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(7.00000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Puig Fernandez"),new String("3333333"),new String("3S1M-ADE"),7.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Marti Lopez"),new String("5555555"),new String("3S1T-MI"),4.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Eva Gonzalez Marti"),new String("5555555"),new String("3S1T-MI"),7.00000000000000000000e+00),new Calificacion(new String("Luis Puig Fernandez"),new String("3333333"),new String("3S1M-ADE"),7.50000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Luis Puig Fernandez"),new String("3333333"),new String("3S1M-ADE"),0.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Marti Pujol"),new String("1111111"),new String("3S1T"),2.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Perez Lopez"),new String("1111111"),new String("3S1T-MI"),4.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Perez Etxebarria"),new String("1111111"),new String("3S2T-B"),5.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Luis Puig Fernandez"),new String("3333333"),new String("3S1M-ADE"),0.00000000000000000000e+00)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_37")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_38")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Sanchez Fernandez"),new String("4444444"),new String("3S2T-B"),6.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Gonzalez Lopez"),new String("3333333"),new String("3S1T"),6.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("3333333")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Marti Lopez"),new String("4444444"),new String("3S1T"),1.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Suarez Pujol"),new String("2222222"),new String("3S1T-MI"),8.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Sanchez Soler"),new String("5555555"),new String("3S1M-ADE"),6.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Aguirre Gonzalez"),new String("6666666"),new String("3S1T"),5.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Etxebarria Aguirre"),new String("1111111"),new String("3S2T-B"),5.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Aguirre Perez"),new String("5555555"),new String("3S1T"),7.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Suarez Gonzalez"),new String("4444444"),new String("3S1T"),2.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("4444444")).doCall().checkResult(new Calificacion(new String("Daniel Suarez Gonzalez"),new String("4444444"),new String("3S1T"),2.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.79999999999999982236e+00) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.79999999999999982236e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Ainhoa Etxebarria Aguirre"),new String("1111111"),new String("3S2T-B"),5.25000000000000000000e+00),new Calificacion(new String("Daniel Suarez Gonzalez"),new String("4444444"),new String("3S1T"),2.75000000000000000000e+00),new Calificacion(new String("Luis Sanchez Soler"),new String("5555555"),new String("3S1M-ADE"),6.75000000000000000000e+00),new Calificacion(new String("Luis Suarez Pujol"),new String("2222222"),new String("3S1T-MI"),8.50000000000000000000e+00),new Calificacion(new String("Paloma Aguirre Gonzalez"),new String("6666666"),new String("3S1T"),5.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.79999999999999982236e+00) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("1111111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.93750000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.93750000000000000000e+00) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_38")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_39")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Suarez Pujol"),new String("2222222"),new String("3S1T"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Juan Suarez Pujol"),new String("2222222"),new String("3S1T"),1.00000000000000000000e+01) })) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Pujol Pujol"),new String("1111111"),new String("3S2T-B"),5.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Susana Pujol Pujol"),new String("1111111"),new String("3S2T-B"),5.25000000000000000000e+00),new Calificacion(new String("Juan Suarez Pujol"),new String("2222222"),new String("3S1T"),1.00000000000000000000e+01) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Sanchez Lopez"),new String("5555555"),new String("3S2T-B"),6.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Juan Suarez Pujol"),new String("2222222"),new String("3S1T"),1.00000000000000000000e+01) })) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("1111111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Juan Suarez Pujol"),new String("2222222"),new String("3S1T"),1.00000000000000000000e+01)) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Juan Suarez Pujol"),new String("2222222"),new String("3S1T"),1.00000000000000000000e+01)) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Juan Suarez Pujol"),new String("2222222"),new String("3S1T"),1.00000000000000000000e+01) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Juan Suarez Pujol"),new String("2222222"),new String("3S1T"),1.00000000000000000000e+01) })) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Gonzalez Aguirre"),new String("4444444"),new String("3S1M-ADE"),1.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Aguirre Lopez"),new String("5555555"),new String("3S1T"),5.00000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Juan Suarez Pujol"),new String("2222222"),new String("3S1T"),3.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Gonzalez Gonzalez"),new String("6666666"),new String("3S1M-ADE"),7.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),2)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Gonzalez Aguirre"),new String("3333333"),new String("3S2T-B"),1.00000000000000000000e+01).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_39")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_40")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Puig Marti"),new String("4444444"),new String("3S1M-ADE"),1.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Gonzalez Sanchez"),new String("4444444"),new String("3S1T-MI"),7.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Pujol Etxebarria"),new String("5555555"),new String("3S1M-ADE"),1.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Marti Perez"),new String("2222222"),new String("3S2T-B"),9.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.25000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Juan Pujol Etxebarria"),new String("5555555"),new String("3S1M-ADE"),1.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Etxebarria Lopez"),new String("5555555"),new String("3S1M-ADE"),3.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Puig Marti"),new String("4444444"),new String("3S2T-B"),8.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Jordi Puig Marti"),new String("4444444"),new String("3S2T-B"),9.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Soler Puig"),new String("3333333"),new String("3S2T-B"),3.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2)))) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("3333333")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Jordi Puig Marti"),new String("4444444"),new String("3S2T-B"),9.25000000000000000000e+00),new Calificacion(new String("Juan Pujol Etxebarria"),new String("5555555"),new String("3S1M-ADE"),1.00000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_40")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_41")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Gonzalez Pujol"),new String("4444444"),new String("3S1M-ADE"),9.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Fernandez Suarez"),new String("2222222"),new String("3S1M-ADE"),8.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),2)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Marc Fernandez Suarez"),new String("2222222"),new String("3S1M-ADE"),8.25000000000000000000e+00),new Calificacion(new String("Maria Gonzalez Pujol"),new String("4444444"),new String("3S1M-ADE"),9.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Marc Fernandez Suarez"),new String("2222222"),new String("3S1M-ADE"),8.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),2)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Soler Etxebarria"),new String("2222222"),new String("3S2T-B"),6.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Maria Gonzalez Pujol"),new String("4444444"),new String("3S1M-ADE"),3.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Suarez Perez"),new String("4444444"),new String("3S2T-B"),0.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Marc Fernandez Suarez"),new String("2222222"),new String("3S1M-ADE"),8.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Fernandez Fernandez"),new String("3333333"),new String("3S1T-MI"),2.50000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Perez Perez"),new String("1111111"),new String("3S1T-MI"),2.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("3333333")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Fernandez Marti"),new String("1111111"),new String("3S2T-B"),9.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Pujol Aguirre"),new String("5555555"),new String("3S1T"),5.00000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Pablo Perez Perez"),new String("1111111"),new String("3S1T-MI"),7.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Pablo Perez Perez"),new String("1111111"),new String("3S1T-MI"),7.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Marti Fernandez"),new String("6666666"),new String("3S2T-B"),2.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Soler Gonzalez"),new String("6666666"),new String("3S1T-MI"),2.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_41")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_42 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_42")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Soler Soler"),new String("3333333"),new String("3S1M-ADE"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Soler Pujol"),new String("4444444"),new String("3S1T"),9.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Ainhoa Soler Pujol"),new String("4444444"),new String("3S1T"),9.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Puig Soler"),new String("5555555"),new String("3S1M-ADE"),5.00000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Etxebarria Sanchez"),new String("5555555"),new String("3S1M-ADE"),2.50000000000000000000e-01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Perez Suarez"),new String("3333333"),new String("3S1T-MI"),2.50000000000000000000e-01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Aguirre Soler"),new String("6666666"),new String("3S1M-ADE"),6.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Perez Gonzalez"),new String("5555555"),new String("3S2T-B"),2.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Etxebarria Soler"),new String("3333333"),new String("3S1T-MI"),4.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),3),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Suarez Puig"),new String("3333333"),new String("3S1T"),7.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Soler Perez"),new String("2222222"),new String("3S1M-ADE"),3.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.90000000000000035527e+00) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),4),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.90000000000000035527e+00) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("6666666")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Suarez Gonzalez"),new String("1111111"),new String("3S2T-B"),6.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),3),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Ainhoa Soler Pujol"),new String("4444444"),new String("3S1T"),9.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Marti Gonzalez"),new String("5555555"),new String("3S2T-B"),7.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Etxebarria Perez"),new String("1111111"),new String("3S1M-ADE"),7.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Suarez Marti"),new String("2222222"),new String("3S1T"),8.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_42")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_43 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_43")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Fernandez Aguirre"),new String("4444444"),new String("3S1M-ADE"),4.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Soler Soler"),new String("1111111"),new String("3S2T-B"),6.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Lopez Pujol"),new String("4444444"),new String("3S2T-B"),2.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.37500000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Aguirre Soler"),new String("3333333"),new String("3S2T-B"),9.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Pujol Perez"),new String("2222222"),new String("3S2T-B"),5.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("1111111")).doCall().checkResult(new Calificacion(new String("Daniel Soler Soler"),new String("1111111"),new String("3S2T-B"),6.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("1111111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Juan Aguirre Soler"),new String("3333333"),new String("3S2T-B"),9.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(6.75000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Etxebarria Marti"),new String("5555555"),new String("3S2T-B"),1.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Juan Aguirre Soler"),new String("3333333"),new String("3S2T-B"),9.75000000000000000000e+00),new Calificacion(new String("Jordi Fernandez Aguirre"),new String("4444444"),new String("3S1M-ADE"),4.75000000000000000000e+00),new Calificacion(new String("Iker Etxebarria Marti"),new String("5555555"),new String("3S2T-B"),1.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Fernandez Etxebarria"),new String("5555555"),new String("3S2T-B"),1.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Juan Aguirre Soler"),new String("3333333"),new String("3S2T-B"),9.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Juan Aguirre Soler"),new String("3333333"),new String("3S2T-B"),8.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Etxebarria Fernandez"),new String("5555555"),new String("3S1M-ADE"),8.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Sanchez Pujol"),new String("5555555"),new String("3S2T-B"),5.00000000000000000000e-01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Sanchez Fernandez"),new String("2222222"),new String("3S1M-ADE"),7.50000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Juan Aguirre Soler"),new String("3333333"),new String("3S2T-B"),8.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Suarez Pujol"),new String("2222222"),new String("3S2T-B"),2.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_43")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_44 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_44")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Puig Gonzalez"),new String("4444444"),new String("3S1T"),8.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("4444444")).doCall().checkResult(new Calificacion(new String("Clara Puig Gonzalez"),new String("4444444"),new String("3S1T"),8.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Fernandez Pujol"),new String("4444444"),new String("3S1T-MI"),9.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(9.50000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Fernandez Fernandez"),new String("6666666"),new String("3S1T"),1.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Clara Fernandez Pujol"),new String("4444444"),new String("3S1T-MI"),1.00000000000000000000e+01)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Sanchez Suarez"),new String("4444444"),new String("3S1T-MI"),3.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.87500000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Aguirre Perez"),new String("2222222"),new String("3S1M-ADE"),3.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Puig Soler"),new String("5555555"),new String("3S1T"),2.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.43750000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Suarez Soler"),new String("1111111"),new String("3S1M-ADE"),6.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Gonzalez Aguirre"),new String("3333333"),new String("3S2T-B"),2.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Etxebarria Soler"),new String("5555555"),new String("3S1T-MI"),5.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.91666666666666696273e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Jordi Aguirre Perez"),new String("2222222"),new String("3S1M-ADE"),3.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Sanchez Fernandez"),new String("3333333"),new String("3S1T-MI"),9.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.91666666666666696273e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Sanchez Aguirre"),new String("3333333"),new String("3S1T-MI"),2.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Marti Soler"),new String("4444444"),new String("3S1M-ADE"),6.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Marc Fernandez Fernandez"),new String("6666666"),new String("3S1T"),1.75000000000000000000e+00)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_44")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_45 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_45")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Marti Lopez"),new String("4444444"),new String("3S1M-ADE"),9.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Marti Etxebarria"),new String("2222222"),new String("3S2T-B"),7.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Etxebarria Marti"),new String("4444444"),new String("3S2T-B"),6.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Marti Etxebarria"),new String("2222222"),new String("3S2T-B"),4.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Montserrat Suarez Gonzalez"),new String("6666666"),new String("3S1T"),3.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Marc Marti Etxebarria"),new String("2222222"),new String("3S2T-B"),7.25000000000000000000e+00),new Calificacion(new String("Unai Etxebarria Marti"),new String("4444444"),new String("3S2T-B"),6.00000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Aguirre Etxebarria"),new String("4444444"),new String("3S2T-B"),2.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Marc Marti Etxebarria"),new String("2222222"),new String("3S2T-B"),7.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Suarez Aguirre"),new String("1111111"),new String("3S1M-ADE"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Montserrat Soler Lopez"),new String("1111111"),new String("3S2T-B"),7.50000000000000000000e-01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Montserrat Suarez Gonzalez"),new String("6666666"),new String("3S1T"),3.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Montserrat Suarez Gonzalez"),new String("6666666"),new String("3S1T"),3.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Iker Suarez Aguirre"),new String("1111111"),new String("3S1M-ADE"),3.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Puig Etxebarria"),new String("3333333"),new String("3S1T-MI"),6.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.40000000000000035527e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Suarez Fernandez"),new String("4444444"),new String("3S1M-ADE"),7.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Gonzalez Etxebarria"),new String("4444444"),new String("3S1M-ADE"),9.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1)))) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Montserrat Suarez Gonzalez"),new String("6666666"),new String("3S1T"),8.75000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Pujol Soler"),new String("6666666"),new String("3S1T-MI"),5.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(6.50000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Jose Puig Etxebarria"),new String("3333333"),new String("3S1T-MI"),6.50000000000000000000e+00),new Calificacion(new String("Marc Marti Etxebarria"),new String("2222222"),new String("3S2T-B"),7.25000000000000000000e+00),new Calificacion(new String("Montserrat Suarez Gonzalez"),new String("6666666"),new String("3S1T"),8.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Jose Puig Etxebarria"),new String("3333333"),new String("3S1T-MI"),6.50000000000000000000e+00)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_45")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_46 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_46")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Suarez Aguirre"),new String("6666666"),new String("3S1T-MI"),4.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Sanchez Gonzalez"),new String("3333333"),new String("3S1T"),3.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Fernandez Puig"),new String("5555555"),new String("3S2T-B"),6.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Perez Pujol"),new String("3333333"),new String("3S1T"),5.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Eva Sanchez Gonzalez"),new String("3333333"),new String("3S1T"),3.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Jorge Suarez Aguirre"),new String("6666666"),new String("3S1T-MI"),4.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Etxebarria Suarez"),new String("3333333"),new String("3S1T-MI"),1.00000000000000000000e+01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Jorge Suarez Aguirre"),new String("6666666"),new String("3S1T-MI"),4.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Suarez Soler"),new String("6666666"),new String("3S1M-ADE"),9.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Eva Sanchez Gonzalez"),new String("3333333"),new String("3S1T"),3.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Sanchez Sanchez"),new String("6666666"),new String("3S1T-MI"),7.50000000000000000000e-01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Suarez Fernandez"),new String("4444444"),new String("3S1M-ADE"),7.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Fernandez Aguirre"),new String("2222222"),new String("3S1M-ADE"),5.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Eva Sanchez Gonzalez"),new String("3333333"),new String("3S1T"),9.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Jorge Fernandez Puig"),new String("5555555"),new String("3S2T-B"),8.75000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Puig Puig"),new String("1111111"),new String("3S1T"),9.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(7.41666666666666696273e+00) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Jorge Fernandez Puig"),new String("5555555"),new String("3S2T-B"),3.75000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Gonzalez Sanchez"),new String("4444444"),new String("3S2T-B"),5.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Marti Lopez"),new String("1111111"),new String("3S2T-B"),3.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("4444444")).doCall().checkResult(new Calificacion(new String("Daniel Suarez Fernandez"),new String("4444444"),new String("3S1M-ADE"),7.50000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Suarez Pujol"),new String("4444444"),new String("3S1M-ADE"),5.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Pujol Lopez"),new String("5555555"),new String("3S1T"),7.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(6.58333333333333303727e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Lopez Marti"),new String("6666666"),new String("3S1T"),8.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Fernandez Soler"),new String("4444444"),new String("3S1T"),2.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Eva Puig Puig"),new String("1111111"),new String("3S1T"),9.00000000000000000000e+00),new Calificacion(new String("Juan Fernandez Aguirre"),new String("2222222"),new String("3S1M-ADE"),5.25000000000000000000e+00),new Calificacion(new String("Eva Sanchez Gonzalez"),new String("3333333"),new String("3S1T"),9.25000000000000000000e+00),new Calificacion(new String("Daniel Suarez Fernandez"),new String("4444444"),new String("3S1M-ADE"),7.50000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Pujol Fernandez"),new String("4444444"),new String("3S1T"),9.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_46")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_47 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_47")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Lopez Fernandez"),new String("3333333"),new String("3S1T"),1.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Paloma Lopez Fernandez"),new String("3333333"),new String("3S1T"),1.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Etxebarria Suarez"),new String("3333333"),new String("3S1M-ADE"),3.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Paloma Lopez Fernandez"),new String("3333333"),new String("3S1T"),1.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Paloma Lopez Fernandez"),new String("3333333"),new String("3S1T"),1.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Perez Marti"),new String("2222222"),new String("3S1M-ADE"),7.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Soler Lopez"),new String("2222222"),new String("3S1M-ADE"),1.00000000000000000000e+01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Gonzalez Gonzalez"),new String("6666666"),new String("3S1M-ADE"),3.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Paloma Lopez Fernandez"),new String("3333333"),new String("3S1T"),1.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Paloma Lopez Fernandez"),new String("3333333"),new String("3S1T"),1.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Gonzalez Pujol"),new String("1111111"),new String("3S1T"),4.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Juan Gonzalez Pujol"),new String("1111111"),new String("3S1T"),4.25000000000000000000e+00),new Calificacion(new String("Paloma Lopez Fernandez"),new String("3333333"),new String("3S1T"),1.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Susana Gonzalez Gonzalez"),new String("6666666"),new String("3S1M-ADE"),3.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Sanchez Sanchez"),new String("6666666"),new String("3S1T"),8.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Paloma Lopez Fernandez"),new String("3333333"),new String("3S1T"),3.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(3.75000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Etxebarria Pujol"),new String("2222222"),new String("3S1T-MI"),7.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Susana Gonzalez Gonzalez"),new String("6666666"),new String("3S1M-ADE"),3.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Paloma Lopez Fernandez"),new String("3333333"),new String("3S1T"),6.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,null).doCall().checkResult(new IllegalArgumentException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Susana Gonzalez Gonzalez"),new String("6666666"),new String("3S1M-ADE"),3.75000000000000000000e+00)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_47")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_48 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_48")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Soler Soler"),new String("2222222"),new String("3S2T-B"),3.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Soler Suarez"),new String("5555555"),new String("3S1M-ADE"),5.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Luis Soler Suarez"),new String("5555555"),new String("3S1M-ADE"),2.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(2.75000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Pujol Suarez"),new String("6666666"),new String("3S1T"),7.50000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(2.08333333333333348136e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Luis Soler Suarez"),new String("5555555"),new String("3S1M-ADE"),2.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Soler Aguirre"),new String("5555555"),new String("3S1M-ADE"),1.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Lua Pujol Suarez"),new String("6666666"),new String("3S1T"),7.50000000000000000000e-01) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Suarez Sanchez"),new String("6666666"),new String("3S1M-ADE"),8.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Suarez Suarez"),new String("3333333"),new String("3S1M-ADE"),9.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Suarez Etxebarria"),new String("1111111"),new String("3S2T-B"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Suarez Fernandez"),new String("2222222"),new String("3S2T-B"),6.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Gonzalez Lopez"),new String("3333333"),new String("3S1T"),2.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Puig Perez"),new String("4444444"),new String("3S1M-ADE"),7.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Lua Pujol Suarez"),new String("6666666"),new String("3S1T"),3.75000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Etxebarria Aguirre"),new String("4444444"),new String("3S1T"),4.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Aguirre Sanchez"),new String("3333333"),new String("3S2T-B"),2.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Lua Pujol Suarez"),new String("6666666"),new String("3S1T"),3.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Etxebarria Perez"),new String("4444444"),new String("3S2T-B"),5.00000000000000000000e-01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(6.04166666666666696273e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Sanchez Pujol"),new String("4444444"),new String("3S2T-B"),6.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Iker Suarez Suarez"),new String("3333333"),new String("3S1M-ADE"),9.50000000000000000000e+00),new Calificacion(new String("Lua Pujol Suarez"),new String("6666666"),new String("3S1T"),3.75000000000000000000e+00),new Calificacion(new String("Luis Soler Suarez"),new String("5555555"),new String("3S1M-ADE"),2.00000000000000000000e+00),new Calificacion(new String("Marc Suarez Etxebarria"),new String("1111111"),new String("3S2T-B"),1.00000000000000000000e+01),new Calificacion(new String("Paloma Puig Perez"),new String("4444444"),new String("3S1M-ADE"),7.50000000000000000000e+00),new Calificacion(new String("Roi Soler Soler"),new String("2222222"),new String("3S2T-B"),3.50000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Aguirre Soler"),new String("2222222"),new String("3S2T-B"),9.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),3),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Etxebarria Puig"),new String("1111111"),new String("3S1T"),7.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Montserrat Soler Sanchez"),new String("4444444"),new String("3S2T-B"),6.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("4444444")).doCall().checkResult(new Calificacion(new String("Paloma Puig Perez"),new String("4444444"),new String("3S1M-ADE"),7.50000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Etxebarria Puig"),new String("6666666"),new String("3S1T"),1.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Lua Pujol Suarez"),new String("6666666"),new String("3S1T"),1.75000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Paloma Puig Perez"),new String("4444444"),new String("3S1M-ADE"),7.50000000000000000000e-01)).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_48")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_49 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_49")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Suarez Lopez"),new String("1111111"),new String("3S1T-MI"),0.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Nerea Suarez Lopez"),new String("1111111"),new String("3S1T-MI"),7.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Soler Puig"),new String("2222222"),new String("3S1M-ADE"),7.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Nerea Suarez Lopez"),new String("1111111"),new String("3S1T-MI"),7.25000000000000000000e+00),new Calificacion(new String("Clara Soler Puig"),new String("2222222"),new String("3S1M-ADE"),7.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(7.50000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Gonzalez Puig"),new String("4444444"),new String("3S1T"),7.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Nerea Suarez Lopez"),new String("1111111"),new String("3S1T-MI"),7.25000000000000000000e+00),new Calificacion(new String("Clara Soler Puig"),new String("2222222"),new String("3S1M-ADE"),7.75000000000000000000e+00),new Calificacion(new String("Eva Gonzalez Puig"),new String("4444444"),new String("3S1T"),7.50000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Puig Gonzalez"),new String("4444444"),new String("3S2T-B"),0.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,null).doCall().checkResult(new IllegalArgumentException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Eva Gonzalez Puig"),new String("4444444"),new String("3S1T"),7.50000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(7.25000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Nerea Suarez Lopez"),new String("1111111"),new String("3S1T-MI"),7.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Nerea Suarez Lopez"),new String("1111111"),new String("3S1T-MI"),7.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Suarez Soler"),new String("4444444"),new String("3S1T-MI"),3.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.37500000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Etxebarria Marti"),new String("2222222"),new String("3S2T-B"),4.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.16666666666666696273e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Maria Etxebarria Marti"),new String("2222222"),new String("3S2T-B"),4.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Maria Etxebarria Marti"),new String("2222222"),new String("3S2T-B"),9.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Soler Fernandez"),new String("6666666"),new String("3S2T-B"),6.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Nerea Suarez Lopez"),new String("1111111"),new String("3S1T-MI"),7.25000000000000000000e+00),new Calificacion(new String("Maria Etxebarria Marti"),new String("2222222"),new String("3S2T-B"),9.50000000000000000000e+00),new Calificacion(new String("Pablo Soler Fernandez"),new String("6666666"),new String("3S2T-B"),6.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2)))) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Sanchez Gonzalez"),new String("5555555"),new String("3S1T-MI"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Pablo Soler Fernandez"),new String("6666666"),new String("3S2T-B"),6.25000000000000000000e+00),new Calificacion(new String("Nerea Suarez Lopez"),new String("1111111"),new String("3S1T-MI"),7.25000000000000000000e+00),new Calificacion(new String("Maria Etxebarria Marti"),new String("2222222"),new String("3S2T-B"),9.50000000000000000000e+00),new Calificacion(new String("Jose Sanchez Gonzalez"),new String("5555555"),new String("3S1T-MI"),1.00000000000000000000e+01) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("4444444")).doCall().checkResult(new Calificacion(new String("Nerea Suarez Soler"),new String("4444444"),new String("3S1T-MI"),3.50000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),3),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Puig Pujol"),new String("4444444"),new String("3S1M-ADE"),9.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_49")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_50 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_50")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Lopez Etxebarria"),new String("5555555"),new String("3S1T"),5.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Lopez Perez"),new String("6666666"),new String("3S1T-MI"),1.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Jorge Lopez Perez"),new String("6666666"),new String("3S1T-MI"),1.25000000000000000000e+00),new Calificacion(new String("Iker Lopez Etxebarria"),new String("5555555"),new String("3S1T"),5.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("6666666")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Iker Lopez Etxebarria"),new String("5555555"),new String("3S1T"),5.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Iker Lopez Etxebarria"),new String("5555555"),new String("3S1T"),5.75000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Pujol Fernandez"),new String("3333333"),new String("3S1T"),5.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Susana Pujol Fernandez"),new String("3333333"),new String("3S1T"),5.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Susana Pujol Fernandez"),new String("3333333"),new String("3S1T"),5.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Susana Pujol Fernandez"),new String("3333333"),new String("3S1T"),5.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.25000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Sanchez Suarez"),new String("5555555"),new String("3S1T"),1.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Susana Pujol Fernandez"),new String("3333333"),new String("3S1T"),5.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Maria Sanchez Suarez"),new String("5555555"),new String("3S1T"),1.00000000000000000000e+00),new Calificacion(new String("Susana Pujol Fernandez"),new String("3333333"),new String("3S1T"),5.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Maria Sanchez Suarez"),new String("5555555"),new String("3S1T"),1.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Etxebarria Suarez"),new String("2222222"),new String("3S1M-ADE"),3.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Eva Etxebarria Suarez"),new String("2222222"),new String("3S1M-ADE"),3.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Montserrat Pujol Soler"),new String("5555555"),new String("3S1T-MI"),2.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Puig Marti"),new String("6666666"),new String("3S1T"),1.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("3333333")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Aguirre Fernandez"),new String("6666666"),new String("3S1M-ADE"),9.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Eva Etxebarria Suarez"),new String("2222222"),new String("3S1M-ADE"),4.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Eva Etxebarria Suarez"),new String("2222222"),new String("3S1M-ADE"),3.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Marti Suarez"),new String("2222222"),new String("3S2T-B"),8.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Marc Puig Marti"),new String("6666666"),new String("3S1T"),7.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(new Calificacion(new String("Eva Etxebarria Suarez"),new String("2222222"),new String("3S1M-ADE"),3.00000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Etxebarria Aguirre"),new String("4444444"),new String("3S1T"),2.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Perez Etxebarria"),new String("2222222"),new String("3S1M-ADE"),4.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),2)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("4444444")).doCall().checkResult(new Calificacion(new String("Lua Etxebarria Aguirre"),new String("4444444"),new String("3S1T"),2.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),2)))) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Marc Puig Marti"),new String("6666666"),new String("3S1T"),2.50000000000000000000e-01)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_50")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_51 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_51") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_51")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Fernandez Marti"),new String("5555555"),new String("3S1T-MI"),9.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1)))) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Marti Aguirre"),new String("4444444"),new String("3S1T-MI"),4.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Soler Gonzalez"),new String("3333333"),new String("3S1M-ADE"),6.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(6.25000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Lopez Perez"),new String("3333333"),new String("3S1T-MI"),9.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(6.25000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Maria Soler Gonzalez"),new String("3333333"),new String("3S1M-ADE"),6.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Maria Soler Gonzalez"),new String("3333333"),new String("3S1M-ADE"),6.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Lopez Etxebarria"),new String("1111111"),new String("3S1T-MI"),1.00000000000000000000e+01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Perez Aguirre"),new String("4444444"),new String("3S1M-ADE"),2.50000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Maria Soler Gonzalez"),new String("3333333"),new String("3S1M-ADE"),6.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Perez Pujol"),new String("4444444"),new String("3S1M-ADE"),2.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Maria Soler Gonzalez"),new String("3333333"),new String("3S1M-ADE"),8.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Aguirre Pujol"),new String("1111111"),new String("3S2T-B"),4.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Montserrat Lopez Gonzalez"),new String("2222222"),new String("3S2T-B"),2.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Maria Soler Gonzalez"),new String("3333333"),new String("3S1M-ADE"),8.50000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.25000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Fernandez Sanchez"),new String("4444444"),new String("3S1T-MI"),5.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Marti Etxebarria"),new String("4444444"),new String("3S1T-MI"),4.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Gonzalez Marti"),new String("2222222"),new String("3S1T"),3.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Montserrat Lopez Gonzalez"),new String("2222222"),new String("3S2T-B"),5.75000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Gonzalez Puig"),new String("1111111"),new String("3S1T"),7.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Lopez Marti"),new String("2222222"),new String("3S1T-MI"),0.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Fernandez Aguirre"),new String("4444444"),new String("3S1T"),6.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Aguirre Sanchez"),new String("6666666"),new String("3S1T-MI"),3.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Daniel Lopez Etxebarria"),new String("1111111"),new String("3S1T-MI"),5.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Pujol Etxebarria"),new String("2222222"),new String("3S2T-B"),7.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Soler Perez"),new String("4444444"),new String("3S2T-B"),9.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Soler Soler"),new String("5555555"),new String("3S1T-MI"),1.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.08333333333333303727e+00) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_51")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_52 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_52") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_52")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Montserrat Gonzalez Sanchez"),new String("6666666"),new String("3S2T-B"),6.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Etxebarria Marti"),new String("5555555"),new String("3S2T-B"),3.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(5.00000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Jose Etxebarria Marti"),new String("5555555"),new String("3S2T-B"),3.50000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Marti Pujol"),new String("6666666"),new String("3S1T-MI"),2.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Jose Etxebarria Marti"),new String("5555555"),new String("3S2T-B"),1.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Suarez Suarez"),new String("1111111"),new String("3S1M-ADE"),1.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Suarez Perez"),new String("1111111"),new String("3S1T-MI"),7.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Aguirre Aguirre"),new String("6666666"),new String("3S2T-B"),3.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorNombreAlumno()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Montserrat Gonzalez Sanchez"),new String("6666666"),new String("3S2T-B"),6.50000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Montserrat Gonzalez Sanchez"),new String("6666666"),new String("3S2T-B"),6.50000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(2.91666666666666651864e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Marti Aguirre"),new String("3333333"),new String("3S1T-MI"),1.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Etxebarria Aguirre"),new String("5555555"),new String("3S2T-B"),9.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,null).doCall().checkResult(new IllegalArgumentException()) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("6666666")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("1111111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Suarez Gonzalez"),new String("1111111"),new String("3S1T"),8.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("1111111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Iker Marti Aguirre"),new String("3333333"),new String("3S1T-MI"),1.50000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Perez Puig"),new String("2222222"),new String("3S2T-B"),1.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Etxebarria Gonzalez"),new String("2222222"),new String("3S1T"),4.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Lopez Etxebarria"),new String("4444444"),new String("3S1T"),3.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Soler Perez"),new String("5555555"),new String("3S2T-B"),2.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),new ComparadorMatricula()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] {  })) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Iker Marti Aguirre"),new String("3333333"),new String("3S1T-MI"),6.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1)))) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("4444444")).doCall().checkResult(new Calificacion(new String("Eva Lopez Etxebarria"),new String("4444444"),new String("3S1T"),3.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Lopez Puig"),new String("3333333"),new String("3S2T-B"),1.00000000000000000000e+01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Sanchez Etxebarria"),new String("6666666"),new String("3S1T"),4.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Eva Lopez Etxebarria"),new String("4444444"),new String("3S1T"),2.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Eva Lopez Etxebarria"),new String("4444444"),new String("3S1T"),2.50000000000000000000e+00),new Calificacion(new String("Jorge Sanchez Etxebarria"),new String("6666666"),new String("3S1T"),4.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Iker Marti Aguirre"),new String("3333333"),new String("3S1T-MI"),6.00000000000000000000e+00),new Calificacion(new String("Eva Lopez Etxebarria"),new String("4444444"),new String("3S1T"),2.50000000000000000000e+00),new Calificacion(new String("Jorge Sanchez Etxebarria"),new String("6666666"),new String("3S1T"),4.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Aguirre Suarez"),new String("1111111"),new String("3S1T-MI"),9.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Gonzalez Etxebarria"),new String("5555555"),new String("3S1M-ADE"),5.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("4444444")).doCall().checkResult(new Calificacion(new String("Eva Lopez Etxebarria"),new String("4444444"),new String("3S1T"),2.50000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Etxebarria Fernandez"),new String("2222222"),new String("3S1T-MI"),1.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Clara Aguirre Suarez"),new String("1111111"),new String("3S1T-MI"),6.75000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Aguirre Suarez"),new String("3333333"),new String("3S1T-MI"),1.00000000000000000000e+01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Eva Lopez Etxebarria"),new String("4444444"),new String("3S1T"),2.50000000000000000000e+00),new Calificacion(new String("Jorge Sanchez Etxebarria"),new String("6666666"),new String("3S1T"),4.25000000000000000000e+00) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_52")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("asignatura")
  public void test_asignatura_53 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<ActaNotasImpl,Void> v_0 = null ;
ActaNotasImpl v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_asignatura_53") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_asignatura_53")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String("AED"),5.00000000000000000000e+00,2026,false).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Lopez Aguirre"),new String("1111111"),new String("3S1T"),1.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Puig Gonzalez"),new String("6666666"),new String("3S1T"),8.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.50000000000000000000e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Suarez Marti"),new String("2222222"),new String("3S2T-B"),4.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,null,new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Marc Lopez Aguirre"),new String("1111111"),new String("3S1T"),1.00000000000000000000e+00),new Calificacion(new String("Ainhoa Suarez Marti"),new String("2222222"),new String("3S2T-B"),4.00000000000000000000e+00),new Calificacion(new String("Iker Puig Gonzalez"),new String("6666666"),new String("3S1T"),8.00000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Marti Gonzalez"),new String("6666666"),new String("3S1M-ADE"),2.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),2)))) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Marc Lopez Aguirre"),new String("1111111"),new String("3S1T"),9.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Montserrat Gonzalez Perez"),new String("2222222"),new String("3S1T-MI"),7.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(8.08333333333333392545e+00) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Marc Lopez Aguirre"),new String("1111111"),new String("3S1T"),7.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Iker Puig Gonzalez"),new String("6666666"),new String("3S1T"),1.00000000000000000000e+01)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Iker Puig Gonzalez"),new String("6666666"),new String("3S1T"),1.00000000000000000000e+01)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Soler Aguirre"),new String("1111111"),new String("3S2T-B"),1.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Gonzalez Etxebarria"),new String("3333333"),new String("3S1T"),6.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Gonzalez Fernandez"),new String("2222222"),new String("3S1M-ADE"),2.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Iker Puig Gonzalez"),new String("6666666"),new String("3S1T"),1.00000000000000000000e+01)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Puig Marti"),new String("4444444"),new String("3S1T-MI"),3.00000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("3333333")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Lopez Marti"),new String("3333333"),new String("3S1T"),2.25000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Lopez Suarez"),new String("5555555"),new String("3S1T"),2.50000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Maria Lopez Suarez"),new String("5555555"),new String("3S1T"),2.50000000000000000000e-01),new Calificacion(new String("Maria Lopez Marti"),new String("3333333"),new String("3S1T"),2.25000000000000000000e+00),new Calificacion(new String("Marc Lopez Aguirre"),new String("1111111"),new String("3S1T"),7.50000000000000000000e+00),new Calificacion(new String("Iker Puig Gonzalez"),new String("6666666"),new String("3S1T"),1.00000000000000000000e+01) })) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Maria Lopez Marti"),new String("3333333"),new String("3S1T"),9.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Maria Lopez Suarez"),new String("5555555"),new String("3S1T"),2.50000000000000000000e-01)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Montserrat Fernandez Puig"),new String("6666666"),new String("3S1M-ADE"),2.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jordi Lopez Puig"),new String("4444444"),new String("3S1M-ADE"),3.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Marc Marti Aguirre"),new String("3333333"),new String("3S1T"),7.50000000000000000000e-01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),4),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),2)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Pujol Puig"),new String("4444444"),new String("3S1T-MI"),8.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Sanchez Gonzalez"),new String("1111111"),new String("3S2T-B"),8.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Nerea Suarez Aguirre"),new String("6666666"),new String("3S1T-MI"),5.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Montserrat Gonzalez Perez"),new String("2222222"),new String("3S1T-MI"),6.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Marti Aguirre"),new String("3333333"),new String("3S1T"),9.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Marc Lopez Aguirre"),new String("1111111"),new String("3S1T"),3.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("1111111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("6666666")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Iker Puig Pujol"),new String("2222222"),new String("3S1M-ADE"),2.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Eva Lopez Marti"),new String("4444444"),new String("3S1T-MI"),9.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Montserrat Gonzalez Perez"),new String("2222222"),new String("3S1T-MI"),6.50000000000000000000e+00),new Calificacion(new String("Maria Lopez Marti"),new String("3333333"),new String("3S1T"),9.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Perez Pujol"),new String("5555555"),new String("3S1M-ADE"),4.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Maria Fernandez Sanchez"),new String("3333333"),new String("3S1M-ADE"),5.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),2)))) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Daniel Puig Marti"),new String("4444444"),new String("3S1T-MI"),5.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Roi Sanchez Pujol"),new String("6666666"),new String("3S1M-ADE"),1.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Daniel Lopez Soler"),new String("5555555"),new String("3S1M-ADE"),8.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Etxebarria Aguirre"),new String("5555555"),new String("3S1T"),2.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(4.59999999999999964473e+00) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jose Perez Puig"),new String("4444444"),new String("3S1M-ADE"),9.50000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Clara Etxebarria Sanchez"),new String("5555555"),new String("3S2T-B"),2.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Maria Lopez Suarez"),new String("5555555"),new String("3S1T"),1.00000000000000000000e+01)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1)))) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Luis Puig Gonzalez"),new String("3333333"),new String("3S1M-ADE"),8.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Puig Etxebarria"),new String("5555555"),new String("3S1T-MI"),7.50000000000000000000e-01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("4444444")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Ainhoa Perez Fernandez"),new String("5555555"),new String("3S1M-ADE"),2.50000000000000000000e-01).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Suarez Gonzalez"),new String("1111111"),new String("3S2T-B"),7.50000000000000000000e-01).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new NotaMedia(v_1).doCall().checkResult(3.83333333333333348136e+00) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1)))) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Pablo Soler Pujol"),new String("1111111"),new String("3S1M-ADE"),7.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new EsGrupo3S1T(),new ComparadorNota()).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Maria Lopez Marti"),new String("3333333"),new String("3S1T"),9.25000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Roi Sanchez Pujol"),new String("6666666"),new String("3S1M-ADE"),3.50000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("3333333")).doCall().checkResult(new Calificacion(new String("Maria Lopez Marti"),new String("3333333"),new String("3S1T"),9.25000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Unai Soler Sanchez"),new String("4444444"),new String("3S1M-ADE"),7.50000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Fernandez Perez"),new String("6666666"),new String("3S1M-ADE"),8.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Sanchez Lopez"),new String("5555555"),new String("3S1T-MI"),4.75000000000000000000e+00).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Juan Fernandez Aguirre"),new String("5555555"),new String("3S1T"),5.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1T"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1)))) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("3333333")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("5555555")).doCall().checkResult(new Calificacion(new String("Susana Sanchez Lopez"),new String("5555555"),new String("3S1T-MI"),4.75000000000000000000e+00)) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Paloma Suarez Gonzalez"),new String("1111111"),new String("3S2T-B"),8.00000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Jorge Pujol Lopez"),new String("1111111"),new String("3S2T-B"),8.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new GetCalificaciones(v_1,new NotaMayorQue5(),null).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>(new Calificacion[] { new Calificacion(new String("Paloma Suarez Gonzalez"),new String("1111111"),new String("3S2T-B"),8.00000000000000000000e+00),new Calificacion(new String("Unai Soler Sanchez"),new String("4444444"),new String("3S1M-ADE"),7.50000000000000000000e+00) })) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("2222222")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Susana Puig Soler"),new String("1111111"),new String("3S1M-ADE"),5.75000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Lua Suarez Suarez"),new String("6666666"),new String("3S2T-B"),4.25000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AddCalificacion(v_1,new String("Paloma Lopez Pujol"),new String("4444444"),new String("3S1M-ADE"),0.00000000000000000000e+00).doCall().checkResult(new IllegalStateException()) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1)))) ;
if (ok_sofar)
  ok_sofar = new AlumnosPorGrupo(v_1).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("3S1M-ADE"),2),new es.upm.aedlib.Pair<String,Integer>(new String("3S2T-B"),1),new es.upm.aedlib.Pair<String,Integer>(new String("3S1T-MI"),1)))) ;
if (ok_sofar)
  ok_sofar = new DeleteCalificacion(v_1,new String("5555555")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new UpdateCalificacion(v_1,new Calificacion(new String("Roi Sanchez Pujol"),new String("6666666"),new String("3S1M-ADE"),7.25000000000000000000e+00)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetCalificacion(v_1,new String("6666666")).doCall().checkResult(new Calificacion(new String("Roi Sanchez Pujol"),new String("6666666"),new String("3S1M-ADE"),7.25000000000000000000e+00)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_asignatura_53")) ;
    ResultsHandler.add_result(new String("asignatura"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab1";
}
static class ActaNotasUtils {
  private static int contador = 1;
  private static IdentityHashMap<Object,String> actaMap;

  public static void resetPrinter() {
    actaMap = new IdentityHashMap<>();
    contador = 1;
  }

  public static String printer(Object obj) {
    if (obj instanceof ActaNotasImpl) {
      String name = actaMap.get(obj);
      if (name == null) {
        name = "a"+Integer.toString(contador);
        actaMap.put(obj,name);
        ++contador;
      }
      return name;
    } else if (obj instanceof ComparadorMatricula)
      return "ComparadorMatricula";
    else if (obj instanceof ComparadorNombreAlumno)
      return "ComparadorNombreAlumno";
    else if (obj instanceof ComparadorNota)
      return "ComparadorNota";
    else if (obj instanceof NotaMayorQue5)
      return "nota() > 5";
    else if (obj instanceof EsGrupo3S1T)
      return "grupo().equals(\"3S1T\")";
    else
      return TestUtils.printer(obj, x -> printer(x));
  }

  public static boolean doubleAlmostEqual(TestCall<?,?> call, double d1, Object obj2) {
    boolean result = false;
    if (obj2 instanceof Double) {
      Double d2 = (Double) obj2;
      result = doubleAlmostEqual(d1,d2);
    }
    if (!result) {
        TestUtils.printError
          (TestUtils.ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned the value "+d1+
           "\nwhich differs from the expected value "+obj2);
        return false;
    }
    return true;
  }

  public static boolean doubleAlmostEqual(double d1, double d2) {
    double epsilon = 0.00001d;
    return Math.abs(d1-d2) < epsilon;
  }

  public static int doubleCompare(double d1, double d2) {
    double epsilon = 0.00001d;
    if (Math.abs(d1-d2) < epsilon) return 0;
    else if (d1-d2 < 0.0) return -1;
    else return 1;
  }
  
}

public static class ComparadorMatricula implements Comparator<Calificacion> {
  public int compare(Calificacion c1, Calificacion c2) {
    return c1.matricula().compareTo(c2.matricula());
  }
}

public static class ComparadorNombreAlumno implements Comparator<Calificacion> {
  public int compare(Calificacion c1, Calificacion c2) {
    return c1.nombreAlumno().compareTo(c2.nombreAlumno());
  }
}

public static class ComparadorNota implements Comparator<Calificacion> {
  public int compare(Calificacion c1, Calificacion c2) {
    return ActaNotasUtils.doubleCompare(c1.nota(),c2.nota());
  }
}

static class NotaMayorQue5 implements Function<Calificacion,Boolean> {
  public Boolean apply(Calificacion c) {
    return ActaNotasUtils.doubleCompare(c.nota(),5.0) > 0;
  }
}

static class EsGrupo3S1T implements Function<Calificacion,Boolean> {
  public Boolean apply(Calificacion c) {
    return c.grupo().equals("3S1T");
  }
}




























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";
    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.left())+","+print.apply(p.right())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Tree<?>) {
      Tree<?> t = (Tree<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("\n");
      buf.append(t.toString());
      buf.append("\n");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if(obj instanceof char[]) {
      char[] arr = (char[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        char aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
          TestData.message("the call to "+msg+" raised the exception "+exc+
                             " although it should not have");
          break;
      default:
          TestData.message(" -- the exception "+exc+" was raised although it "+
                             "should not have been\n"+msg);
          break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }

    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
          return "after executing the call sequence ";
      case LAST:
          return "while executing the last statement of call sequence ";
      case DURING:
          return "while executing the call sequence ";
      case UNRELATED:
          return "";
      }
      return "";
    }
  }

  static <E> boolean checkNull(TestCall<E,Boolean> call,
                               TestResult<E,Boolean> result,
                               Boolean expected) {
    if (expected) return call.nonNull();
    else return call.isNull();
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  static <E> boolean attributeEquals(TestCall<?,?> call, String attributeName, E value, E expected) {
    if (expected == null) {
      if (value != null) {
        printError
          (ExecutionTime.AFTER,
           "after the call "+call.toString()+
           " the attribute "+attributeName+
           " has the value \n  "+TestUtils.print(value)+
           "\nwhich differs from the expected value null");
        return false;
      }
    } else {
      if (!expected.equals(value)) {
        printError
          (ExecutionTime.AFTER,
           "after the call "+call.toString()+
           " the attribute "+attributeName+
           " has the value \n  "+TestUtils.print(value)+
           "\nwhich differs from the expected value \n  "+TestUtils.print(expected));
        return false;
      }
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
                                     TestResult<E,F> result,
                                     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
        ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2))
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {

    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();

    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterator with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, F[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,PositionList<F>> call,
     TestResult<Iterable<E>,PositionList<F>> result,
     Iterable<F> expected) {
    java.util.Iterator<E> it = null;
    java.util.Iterator<F> exp = expected.iterator();

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
                                return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, Iterable<F> original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    PositionList<F> e = extractElementsFromIterable(callString, original);
    if (l == null) return false;

    boolean correct = (e.size() == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      Position<F> cursorE = e.first();
      for (int j=0; j<e.size(); j++) {
        if (cursorE.element() == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && cursorE.element().equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
                                cursorE = e.next(cursorE);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(e));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;

      if (l.size() != original.length) {
          ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
          E elem = lPos.element();

          if (elem == null) ok_sofar = (original[i] == null);
          else ok_sofar = elem.equals(original[i]);

          lPos = l.next(lPos);
          ++i;
      }

      if (!ok_sofar) {
          printError
            (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input list "+TestUtils.print(original)+
             "; it has now the elements "+TestUtils.print(l));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          printError
              (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input array "+TestUtils.print(original)+
               "; it has now the elements "+TestUtils.print(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> Iterable<E> returnIterable(Iterable<E> iterable) {
    return iterable;
  }

  static boolean redefinesToString(TestCall<?,?> call, Object obj, String result) {
    String objectToString =
      obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
    if (result.equals(objectToString)) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned the same result as the Object toString method.\n"+
           "The class should redefine the public toString() method.\n");
        return false;
    }
    return true;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;

    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
        (Integer) majorMethod.invoke(null);
      aedlibMinor =
        (Integer) minorMethod.invoke(null);
      aedlibPatchlevel =
        (Integer) patchlevelMethod.invoke(null);

      isOk =
        ((aedlibMajor > major)
         || ((aedlibMajor == major) &&
             ((aedlibMinor > minor)
              || ((aedlibMinor == minor) &&
                  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
        ("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
        "*** ERROR: aedlib is too old. Minimum version needed is "+
        major+"."+minor+"."+patchlevel+"; your version is "+
        aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
        ". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true;
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }

  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }

  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }

  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
        return callString + "  =>  " + getException();
      else
        {
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());

    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));

    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean isNull() {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n");
      return false;
    } else return true;
  }

  boolean isNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] newer, Object[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] newer, int[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] newer, char[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);

    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }

    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "\nthe call to "+this+" returned null, "+
           "but should have returned "+TestUtils.print(expected));
        return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
         "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }
  }

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}

static class NotaMedia extends TestCall<Double,Object>
{
  ActaNotas x_1;
  String callString;
  
  public NotaMedia (ActaNotas x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".notaMedia")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Double call () throws IllegalStateException
  {
    return x_1.notaMedia() ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!ActaNotasUtils.doubleAlmostEqual(this,this.result.getValue(),expected))
      return false ;
    return true ;
  }
  
}


static class Asignatura extends TestCall<String,String>
{
  ActaNotas x_1;
  String callString;
  
  public Asignatura (ActaNotas x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".asignatura")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public String call () 
  {
    return x_1.asignatura() ;
  }
  
  public boolean checkResult (String expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class EsConvocatoriaExtraordinaria extends TestCall<Boolean,Boolean>
{
  ActaNotas x_1;
  String callString;
  
  public EsConvocatoriaExtraordinaria (ActaNotas x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".esConvocatoriaExtraordinaria")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return x_1.esConvocatoriaExtraordinaria() ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Constructor extends TestCall<ActaNotasImpl,Void>
{
  String x_1;
  double x_2;
  int x_3;
  boolean x_4;
  String callString;
  
  public Constructor (String x_1,double x_2,int x_3,boolean x_4)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
    this.x_4 = x_4 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("new ActaNotasImpl")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_3)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_4)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public ActaNotasImpl call () 
  {
    return new ActaNotasImpl(x_1,x_2,x_3,x_4) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class GetCalificaciones extends TestCall<es.upm.aedlib.indexedlist.IndexedList<Calificacion>,es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion>>
{
  ActaNotas x_1;
  Function<Calificacion,Boolean> x_2;
  Comparator<Calificacion> x_3;
  String callString;
  
  public GetCalificaciones (ActaNotas x_1,Function<Calificacion,Boolean> x_2,Comparator<Calificacion> x_3)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".getCalificaciones")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_3)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public es.upm.aedlib.indexedlist.IndexedList<Calificacion> call () 
  {
    return x_1.getCalificaciones(x_2,x_3) ;
  }
  
  public boolean checkResult (es.upm.aedlib.indexedlist.ArrayIndexedList<Calificacion> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Equals extends TestCall<Boolean,Boolean>
{
  ActaNotas x_1;
  ActaNotas x_2;
  String callString;
  
  public Equals (ActaNotas x_1,ActaNotas x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".equals")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return x_1.equals(x_2) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class ToString extends TestCall<String,Void>
{
  ActaNotas acta;
  String callString;
  
  public ToString (ActaNotas acta)
  {
    this.acta = acta ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(acta)) ;
      output.append(new String(".toString")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public String call () 
  {
    return acta.toString() ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!TestUtils.redefinesToString(this,this.acta,this.result.getValue()))
      return false ;
    return true ;
  }
  
}


static class AddCalificacion extends TestCall<Void,Throwable>
{
  ActaNotas x_1;
  String x_2;
  String x_3;
  String x_4;
  double x_5;
  String callString;
  
  public AddCalificacion (ActaNotas x_1,String x_2,String x_3,String x_4,double x_5)
  {
    voidReturn = true ;
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
    this.x_4 = x_4 ;
    this.x_5 = x_5 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".addCalificacion")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_3)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_4)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_5)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Void call () throws IllegalStateException
  {
    x_1.addCalificacion(x_2,x_3,x_4,x_5) ;
    return null ;
  }
  
  public boolean checkResult (Throwable expected) 
  {
    if (expected != null)
    {
      if (!throwsException(expected.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class DeleteCalificacion extends TestCall<Void,Throwable>
{
  ActaNotas x_1;
  String x_2;
  String callString;
  
  public DeleteCalificacion (ActaNotas x_1,String x_2)
  {
    voidReturn = true ;
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".deleteCalificacion")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Void call () throws IllegalStateException
  {
    x_1.deleteCalificacion(x_2) ;
    return null ;
  }
  
  public boolean checkResult (Throwable expected) 
  {
    if (expected != null)
    {
      if (!throwsException(expected.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class UpdateCalificacion extends TestCall<Void,Throwable>
{
  ActaNotas x_1;
  Calificacion x_2;
  String callString;
  
  public UpdateCalificacion (ActaNotas x_1,Calificacion x_2)
  {
    voidReturn = true ;
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".updateCalificacion")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Void call () throws IllegalStateException
  {
    x_1.updateCalificacion(x_2) ;
    return null ;
  }
  
  public boolean checkResult (Throwable expected) 
  {
    if (expected != null)
    {
      if (!throwsException(expected.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class GetCalificacion extends TestCall<Calificacion,Object>
{
  ActaNotas x_1;
  String x_2;
  String callString;
  
  public GetCalificacion (ActaNotas x_1,String x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".getCalificacion")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Calificacion call () throws IllegalStateException
  {
    return x_1.getCalificacion(x_2) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class AlumnosPorGrupo extends TestCall<es.upm.aedlib.indexedlist.IndexedList<es.upm.aedlib.Pair<String,Integer>>,es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>>>
{
  ActaNotas x_1;
  String callString;
  
  public AlumnosPorGrupo (ActaNotas x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".alumnosPorGrupo")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public es.upm.aedlib.indexedlist.IndexedList<es.upm.aedlib.Pair<String,Integer>> call () 
  {
    return x_1.alumnosPorGrupo() ;
  }
  
  public boolean checkResult (es.upm.aedlib.indexedlist.ArrayIndexedList<es.upm.aedlib.Pair<String,Integer>> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!TestUtils.sameElements(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Anyo extends TestCall<Integer,Integer>
{
  ActaNotas x_1;
  String callString;
  
  public Anyo (ActaNotas x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".anyo")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Integer call () 
  {
    return x_1.anyo() ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class MinNotaAprobado extends TestCall<Double,Double>
{
  ActaNotas x_1;
  String callString;
  
  public MinNotaAprobado (ActaNotas x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".minNotaAprobado")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Double call () 
  {
    return x_1.minNotaAprobado() ;
  }
  
  public boolean checkResult (Double expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}







static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;
  static int individualTimeout = 10;
  static int globalTimeout = 60;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static int getIndividualTimeout() {
    return individualTimeout;
  }

  public static void setIndividualTimeout(int timeout) {
    individualTimeout = timeout;
  }

  public static int getGlobalTimeout() {
    return globalTimeout;
  }

  public static void setGlobalTimeout(int timeout) {
    globalTimeout = timeout;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}










static class ResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    if (results_sofar == null)
      results_sofar = new LinkedHashMap<String,Boolean>();
    if (runningTests == null)
      runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests "+runningTests+" are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath)
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);

    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8))
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }

    return sb.toString();
  }

}

static class TesterCode
{
  
  public static void resetPrinter () 
  {
    ActaNotasUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return ActaNotasUtils.printer(obj) ;
  }
  
}


}
