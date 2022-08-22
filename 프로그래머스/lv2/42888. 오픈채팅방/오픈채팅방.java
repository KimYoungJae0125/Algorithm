import java.util.*;

class Solution {
    String[] solution(String[] record) {
        Map<String, String> userMap = new LinkedHashMap<>();
        List<OpenChat> open = new ArrayList<>();
        for(int i=0, len= record.length; i<len; i++) {
            String[] spSt = record[i].split(" ");
            switch (spSt[0]) {
                case "Enter":
                case "Change":
                    userMap.put(spSt[1], spSt[2]);
                    open.add(new OpenChat(spSt[0], spSt[1]));
                    break;
                case "Leave":
                    open.add(new OpenChat(spSt[0], spSt[1]));
                    break;
            }
        }
        OpenChat openChat = new OpenChat();

        StringBuilder sb = new StringBuilder();
        for(int i=0, len=open.size(); i<len; i++) {
            openChat.getMessage(open.get(i), userMap, sb);
        }

        return sb.toString().split(",");
    }

    class OpenChat {
        String status;
        String id;

        OpenChat() {

        }
        OpenChat(String status, String id) {
            this.status = status;
            this.id = id;
        }

        void getMessage(OpenChat openChat, Map<String, String> userMap, StringBuilder sb) {
            if(!"Change".equals(openChat.status)) {
                switch (openChat.status) {
                    case "Enter":
                         sb.append(userMap.get(openChat.id) + "님이 들어왔습니다.,");
                         break;
                    case "Leave":
                         sb.append(userMap.get(openChat.id) + "님이 나갔습니다.,");
                         break;
                }
            }
        }

    }
}