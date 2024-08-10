package optional;

import java.util.ArrayList;
import java.util.Optional;

public class UserInfoTestUsingOptional {

    public static void main(String[] args) {
        ArrayList<UserInfo> userInfoList = new ArrayList<>();

        userInfoList.add(new UserInfo(12345, "James"));
        userInfoList.add(new UserInfo(12346, "Tomas"));
        userInfoList.add(new UserInfo(12347, "Edward"));

        usingOptional(userInfoList);
    }

    public static void usingOptional(ArrayList<UserInfo> list){

        Optional<UserInfo> userInfoOptional = getUserInfoByIdOptional(12348, list);

        // ifPresent() 메소드를 사용하여 값이 존재하는 경우에만 처리
        userInfoOptional.ifPresent(userInfo -> System.out.println("User name found: " + userInfo.getName()));

        // isPresent()를 사용하여 조건문 처리

        if (userInfoOptional.isPresent()) {
            System.out.println("User name found: " + userInfoOptional.get().getName());
        } else {
            System.out.println("User not found.");
        }

        // orElse()를 사용하여 기본값 설정
        UserInfo nameOrDefault = userInfoOptional.orElse(new UserInfo(00000, "Guest"));
        System.out.println("User name: " + nameOrDefault.getName());

        // orElseGet()를 사용하여 기본값을 느긋하게 계산
        UserInfo nameOrComputed = userInfoOptional.orElseGet(() -> generateDefaultUserInfo());
        System.out.println("User name: " + nameOrComputed.getName());

        // orElseThrow()를 사용하여 값이 없을 때 예외 발생
        try {
            UserInfo userNotFound = userInfoOptional.orElseThrow(() -> new IllegalStateException("User not found"));
            System.out.println("User name: " + userNotFound.getName());
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }

    public static Optional<UserInfo> getUserInfoByIdOptional(int id, ArrayList<UserInfo> list) {
        for(UserInfo userInfo : list){
            if (id == userInfo.getId())
                return Optional.of(userInfo);
        }
        return Optional.empty();
    }

    public static UserInfo generateDefaultUserInfo(){
        return new UserInfo(00000, "Guest");
    }
}
