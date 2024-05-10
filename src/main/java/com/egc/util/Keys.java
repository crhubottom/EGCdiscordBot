package com.egc.util;

import com.egc.Main;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Keys {
    
    /**
     * Gets the key from token.json
     * @param name name of key
     * @return key from token.json
     */
    public static String get(String name) {
        ObjectMapper mapper = new ObjectMapper();
        File json_file = new File("");

        try {
            json_file = new File(Main.class.getResource("com.egc/tokens.json").toURI());
        } catch (URISyntaxException e) {
            System.err.println("tokens.json not found.");
            System.exit(1);
        }

        try {
            json_file.createNewFile(); // only creates new file if it doesn't exist
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }

        JsonNode root;
        try {
            root = mapper.readTree(json_file);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Is tokens.json set up correctly?");
            System.exit(2);
            return null;
        }
        return root.get(name).asText();
    }
}
