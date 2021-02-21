package com.example.flipper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flipper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.insertButton.setOnClickListener {
            FlipperManager.tableFlipperPlugin.insert(JSON)
        }
    }

    companion object {
        // https://www.json-generator.com/
        const val JSON = "[\n" +
                "  {\n" +
                "    \"_id\": \"603268fa74f8cb0028c9283f\",\n" +
                "    \"index\": 0,\n" +
                "    \"guid\": \"80c4a122-81a3-4ff6-a871-969e5b87bb4b\",\n" +
                "    \"isActive\": true,\n" +
                "    \"balance\": \"\$3,721.05\",\n" +
                "    \"picture\": \"http://placehold.it/32x32\",\n" +
                "    \"age\": 22,\n" +
                "    \"eyeColor\": \"blue\",\n" +
                "    \"name\": \"Ratliff Mccormick\",\n" +
                "    \"gender\": \"male\",\n" +
                "    \"company\": \"PAPRICUT\",\n" +
                "    \"email\": \"ratliffmccormick@papricut.com\",\n" +
                "    \"phone\": \"+1 (890) 569-3329\",\n" +
                "    \"address\": \"844 Ridgewood Place, Winesburg, Nebraska, 2934\",\n" +
                "    \"about\": \"Sunt est irure sit in deserunt consectetur dolore fugiat eiusmod magna non veniam officia fugiat. Eiusmod aliquip cillum quis dolor nostrud exercitation ullamco id ea. Exercitation ullamco commodo do pariatur nulla officia consectetur nisi deserunt sint quis. Qui mollit sunt do aliquip velit elit mollit non in ad exercitation ea enim in. Sint commodo sint minim ut. Duis sint magna fugiat consequat sint reprehenderit aute enim in adipisicing adipisicing. Mollit incididunt deserunt sunt non.\\r\\n\",\n" +
                "    \"registered\": \"2016-11-02T11:58:26 -09:00\",\n" +
                "    \"latitude\": -52.237676,\n" +
                "    \"longitude\": 86.272499,\n" +
                "    \"tags\": [\n" +
                "      \"ut\",\n" +
                "      \"officia\",\n" +
                "      \"laboris\",\n" +
                "      \"non\",\n" +
                "      \"voluptate\",\n" +
                "      \"et\",\n" +
                "      \"eiusmod\"\n" +
                "    ],\n" +
                "    \"friends\": [\n" +
                "      {\n" +
                "        \"id\": 0,\n" +
                "        \"name\": \"Nichole Rosales\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Cecilia Best\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 2,\n" +
                "        \"name\": \"Lacy Clarke\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"greeting\": \"Hello, Ratliff Mccormick! You have 4 unread messages.\",\n" +
                "    \"favoriteFruit\": \"strawberry\"\n" +
                "  }\n" +
                "]"
    }
}
