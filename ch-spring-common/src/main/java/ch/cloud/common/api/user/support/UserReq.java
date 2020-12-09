package ch.cloud.common.api.user.support;

/*
 *  作者 Alan.chen
 *  时间 2020/1/17-14:04
 */

public class UserReq {

    /**
     * id
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;


    /**
     * 获取 id
     *
     * @return id id
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置 id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 姓名
     *
     * @return name 姓名
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置 姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 性别
     *
     * @return gender 性别
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * 设置 性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
