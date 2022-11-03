import de.unitrier.st.core.CountryDataPoint;
import de.unitrier.st.core.DataLoader;
import de.unitrier.st.core.DataParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class DataTest {

    @Test
    public void tmpTest() {
        Assert.assertEquals(true, true);
    }

    @Test
    public void goodTest(){
      DataLoader dataLoader = new DataLoader();
      DataParser dataParser = new DataParser();
      String json = dataLoader.loadJsonFile("countries-aggregated_json.json");
      Assert.assertFalse(dataParser.parseJsonData(json).isEmpty());
    }
}
