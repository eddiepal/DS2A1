package sample;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class SampleControllerTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(SampleController.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void handleButtonAction() {
    }

    @org.junit.Test
    public void initialize() {
    }

    @org.junit.Test
    public void test7() {
    }

    @org.junit.Test
    public void grayscale() {
    }

    @org.junit.Test
    public void getPixelColor() {
    }

    @org.junit.Test
    public void blackandwhite2() {
    }

    @org.junit.Test
    public void blackandwhite3() {
    }

    @org.junit.Test
    public void blackandwhite() {
    }

    @org.junit.Test
    public void revertOriginal() {
    }

    @org.junit.Test
    public void viewImage() {
    }

    @org.junit.Test
    public void exitMenu() {

    }

    @org.junit.Test
    public void openSingleFile() {
    }

    @org.junit.Test
    public void openMultipleFiles() {
    }

    @org.junit.Test
    public void openFile() {
    }

    @org.junit.Test
    public void test1() {
    }

    @org.junit.Test
    public void countSheep() {
    }

    @org.junit.Test
    public void test5() {
    }
}
