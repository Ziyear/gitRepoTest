package org.example.gitrepotest;

/**
 * 功能描述 : 响应信息
 *
 * @author zoo 2022-4-27 15:53
 */
public class TestUtils {

    public static String getClassName() {
        return TestUtils.class.getName();
    }

    public static String getPackageName() {
        return TestUtils.class.getPackage().getName();
    }
}
