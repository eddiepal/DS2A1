package sample;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class CounterControllerTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(CounterController.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "testtest.xml");
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void handleButtonAction() {
    }

    @Test
    public void initialize() {
    }

    @Test
    public void test7() {
    }

    @Test
    public void grayscale() {
    }

    @Test
    public void getPixelColor() {
    }

    @Test
    public void blackandwhite() {
    }

    @Test
    public void revertOriginal() {
    }

    @Test
    public void viewImage() {
    }

    @Test
    public void exitMenu() {
    }

    @Test
    public void openSingleFile() {
    }

    @Test
    public void openMultipleFiles() {
    }

    @Test
    public void openFile() {
    }

    @Test
    public void test1() {
    }

    @Test
    public void countSheep() {
    }

    @Test
    public void test5() {
    }
}
