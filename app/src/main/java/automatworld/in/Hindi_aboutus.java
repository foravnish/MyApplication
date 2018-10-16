package automatworld.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by developer on 13-Jun-16.
 */
public class Hindi_aboutus extends Activity{
    TextView text_about;

    ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hinhiaboutus);
        text_about=(TextView)findViewById(R.id.text_about);
        back=(ImageView)findViewById(R.id.back);
        home=(ImageView)findViewById(R.id.home);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),Hindi_mainMenu.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),Hindi_mainMenu.class);
                startActivity(intent);
            }
        });
        text_about.setText("1972 में श्री पी. के. जैन द्वारा स्थापित, ऑटोमैट इंडस्ट्रीज ने वैश्विक उपस्थिति के साथ एक संगठन बनाया है जिसका मुख्यालय नई दिल्ली में है। भारत के कई स्थानों पर इसके उत्पादन कार्यालय है जिसमें 1200 से अधिक लोगों को रोजगार प्राप्त हो रहा है।\n" +
                "\n" +
                "ऑटोमैट सिंचाई फव्वारे, फिल्ट्रैशन और फर्टिगेशन व अन्य सिंचाई सहायक उपकरणों के सबसे बड़े निर्माताओं में से एक है जो की    सिंचाई प्रणाली का एक महत्वपूर्ण हिस्सा है।\n" +
                "\n" +
                "अपनी श्रेणी में 350 से अधिक सिंचाई उत्पादों और 80 से अधिक देशों में उपस्थिति प्राप्त कर चुकि , ऑटोमैट इस अंतर्राष्ट्रीय बाजार की  महत्वपूर्ण उत्पादक है तथा यह सिंचाई जगत की श्रेणी के विभिन्न खरीदारों की कीमत, उत्पाद आदि जुड़ी जरूरतों को पुरा करता है।\n" +
                "\n" +
                "एक वैश्विक अर्थव्यवस्था जहां गुणवत्ता और विश्वसनीयता एक सफल संगठन के लिए आवश्यक हैं, वहीं ऑटोमैट ने इस अर्थव्यवस्था  में अपनी साख साबित कर दी है और उत्पादन क्षेत्र में लगातार नए उत्पादों की अवधारणा में एक मार्ग दर्शक के रूप में उभरी है।\n" +
                "\n" +
                "हम लगातार प्रयास करते है अपने उत्पादों में नवाचार करने का जिसमें हम डिजाइन, निर्माण, तकनीकी विकास आदि को शामिल करते रहते हैं।\n" +
                "\n" +
                "ऑटोमैट की सबसे बड़ी ताकत उसके इंजीनियरिंग के विभिन्न क्षेत्रों में किये गए विश्वसनीय उत्पादों में विकास और उसकी प्रतिस्पर्धी लागत समाधान के साथ आने से ज्ञान, कौशल और संसाधनों को एकत्रित करने की क्षमता है।");
    }
}
