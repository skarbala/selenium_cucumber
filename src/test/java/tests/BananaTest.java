package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import base.TestBase;
import enumerators.BananaTableColumn;
import pages.BananaPage;

public class BananaTest extends TestBase {

  @Test
  public void testDiscount() {
    BananaPage bananaPage = new BananaPage();
    bananaPage.openPage();
    bananaPage.enterBananaAmount("11");
    bananaPage.submitBananaAmount();
    assertEquals("1.65 €", bananaPage.getTableValue(BananaTableColumn.DISCOUNT));
  }
}
