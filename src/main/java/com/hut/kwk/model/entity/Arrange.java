package com.hut.kwk.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Arrange implements Cloneable, Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.course_id
     *
     * @mbg.generated
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.class_id
     *
     * @mbg.generated
     */
    private Integer classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.room_id
     *
     * @mbg.generated
     */
    private Integer roomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.techer_id
     *
     * @mbg.generated
     */
    private Integer techerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.seme_id
     *
     * @mbg.generated
     */
    private Integer semeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.course_name
     *
     * @mbg.generated
     */
    private String courseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.class_name
     *
     * @mbg.generated
     */
    private String className;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.room_name
     *
     * @mbg.generated
     */
    private String roomName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.techer_name
     *
     * @mbg.generated
     */
    private String techerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.star_week
     *
     * @mbg.generated
     */
    private Integer starWeek;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.end_week
     *
     * @mbg.generated
     */
    private Integer endWeek;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.srd
     *
     * @mbg.generated
     */
    private Integer srd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.statu
     *
     * @mbg.generated
     */
    private Integer statu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arrange.mark
     *
     * @mbg.generated
     */
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table arrange
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange(Integer id, Integer courseId, Integer classId, Integer roomId, Integer techerId, Integer semeId, String courseName, String className, String roomName, String techerName, Integer starWeek, Integer endWeek, Integer srd, Integer statu, String mark) {
        this.id = id;
        this.courseId = courseId;
        this.classId = classId;
        this.roomId = roomId;
        this.techerId = techerId;
        this.semeId = semeId;
        this.courseName = courseName;
        this.className = className;
        this.roomName = roomName;
        this.techerName = techerName;
        this.starWeek = starWeek;
        this.endWeek = endWeek;
        this.srd = srd;
        this.statu = statu;
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.id
     *
     * @return the value of arrange.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.id
     *
     * @param id the value for arrange.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.course_id
     *
     * @return the value of arrange.course_id
     *
     * @mbg.generated
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withCourseId(Integer courseId) {
        this.setCourseId(courseId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.course_id
     *
     * @param courseId the value for arrange.course_id
     *
     * @mbg.generated
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.class_id
     *
     * @return the value of arrange.class_id
     *
     * @mbg.generated
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withClassId(Integer classId) {
        this.setClassId(classId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.class_id
     *
     * @param classId the value for arrange.class_id
     *
     * @mbg.generated
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.room_id
     *
     * @return the value of arrange.room_id
     *
     * @mbg.generated
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withRoomId(Integer roomId) {
        this.setRoomId(roomId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.room_id
     *
     * @param roomId the value for arrange.room_id
     *
     * @mbg.generated
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.techer_id
     *
     * @return the value of arrange.techer_id
     *
     * @mbg.generated
     */
    public Integer getTecherId() {
        return techerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withTecherId(Integer techerId) {
        this.setTecherId(techerId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.techer_id
     *
     * @param techerId the value for arrange.techer_id
     *
     * @mbg.generated
     */
    public void setTecherId(Integer techerId) {
        this.techerId = techerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.seme_id
     *
     * @return the value of arrange.seme_id
     *
     * @mbg.generated
     */
    public Integer getSemeId() {
        return semeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withSemeId(Integer semeId) {
        this.setSemeId(semeId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.seme_id
     *
     * @param semeId the value for arrange.seme_id
     *
     * @mbg.generated
     */
    public void setSemeId(Integer semeId) {
        this.semeId = semeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.course_name
     *
     * @return the value of arrange.course_name
     *
     * @mbg.generated
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withCourseName(String courseName) {
        this.setCourseName(courseName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.course_name
     *
     * @param courseName the value for arrange.course_name
     *
     * @mbg.generated
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.class_name
     *
     * @return the value of arrange.class_name
     *
     * @mbg.generated
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withClassName(String className) {
        this.setClassName(className);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.class_name
     *
     * @param className the value for arrange.class_name
     *
     * @mbg.generated
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.room_name
     *
     * @return the value of arrange.room_name
     *
     * @mbg.generated
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withRoomName(String roomName) {
        this.setRoomName(roomName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.room_name
     *
     * @param roomName the value for arrange.room_name
     *
     * @mbg.generated
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.techer_name
     *
     * @return the value of arrange.techer_name
     *
     * @mbg.generated
     */
    public String getTecherName() {
        return techerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withTecherName(String techerName) {
        this.setTecherName(techerName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.techer_name
     *
     * @param techerName the value for arrange.techer_name
     *
     * @mbg.generated
     */
    public void setTecherName(String techerName) {
        this.techerName = techerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.star_week
     *
     * @return the value of arrange.star_week
     *
     * @mbg.generated
     */
    public Integer getStarWeek() {
        return starWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withStarWeek(Integer starWeek) {
        this.setStarWeek(starWeek);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.star_week
     *
     * @param starWeek the value for arrange.star_week
     *
     * @mbg.generated
     */
    public void setStarWeek(Integer starWeek) {
        this.starWeek = starWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.end_week
     *
     * @return the value of arrange.end_week
     *
     * @mbg.generated
     */
    public Integer getEndWeek() {
        return endWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withEndWeek(Integer endWeek) {
        this.setEndWeek(endWeek);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.end_week
     *
     * @param endWeek the value for arrange.end_week
     *
     * @mbg.generated
     */
    public void setEndWeek(Integer endWeek) {
        this.endWeek = endWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.srd
     *
     * @return the value of arrange.srd
     *
     * @mbg.generated
     */
    public Integer getSrd() {
        return srd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withSrd(Integer srd) {
        this.setSrd(srd);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.srd
     *
     * @param srd the value for arrange.srd
     *
     * @mbg.generated
     */
    public void setSrd(Integer srd) {
        this.srd = srd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.statu
     *
     * @return the value of arrange.statu
     *
     * @mbg.generated
     */
    public Integer getStatu() {
        return statu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withStatu(Integer statu) {
        this.setStatu(statu);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.statu
     *
     * @param statu the value for arrange.statu
     *
     * @mbg.generated
     */
    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arrange.mark
     *
     * @return the value of arrange.mark
     *
     * @mbg.generated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    public Arrange withMark(String mark) {
        this.setMark(mark);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arrange.mark
     *
     * @param mark the value for arrange.mark
     *
     * @mbg.generated
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Arrange other = (Arrange) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getRoomId() == null ? other.getRoomId() == null : this.getRoomId().equals(other.getRoomId()))
            && (this.getTecherId() == null ? other.getTecherId() == null : this.getTecherId().equals(other.getTecherId()))
            && (this.getSemeId() == null ? other.getSemeId() == null : this.getSemeId().equals(other.getSemeId()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()))
            && (this.getRoomName() == null ? other.getRoomName() == null : this.getRoomName().equals(other.getRoomName()))
            && (this.getTecherName() == null ? other.getTecherName() == null : this.getTecherName().equals(other.getTecherName()))
            && (this.getStarWeek() == null ? other.getStarWeek() == null : this.getStarWeek().equals(other.getStarWeek()))
            && (this.getEndWeek() == null ? other.getEndWeek() == null : this.getEndWeek().equals(other.getEndWeek()))
            && (this.getSrd() == null ? other.getSrd() == null : this.getSrd().equals(other.getSrd()))
            && (this.getStatu() == null ? other.getStatu() == null : this.getStatu().equals(other.getStatu()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        result = prime * result + ((getTecherId() == null) ? 0 : getTecherId().hashCode());
        result = prime * result + ((getSemeId() == null) ? 0 : getSemeId().hashCode());
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        result = prime * result + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        result = prime * result + ((getTecherName() == null) ? 0 : getTecherName().hashCode());
        result = prime * result + ((getStarWeek() == null) ? 0 : getStarWeek().hashCode());
        result = prime * result + ((getEndWeek() == null) ? 0 : getEndWeek().hashCode());
        result = prime * result + ((getSrd() == null) ? 0 : getSrd().hashCode());
        result = prime * result + ((getStatu() == null) ? 0 : getStatu().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", classId=").append(classId);
        sb.append(", roomId=").append(roomId);
        sb.append(", techerId=").append(techerId);
        sb.append(", semeId=").append(semeId);
        sb.append(", courseName=").append(courseName);
        sb.append(", className=").append(className);
        sb.append(", roomName=").append(roomName);
        sb.append(", techerName=").append(techerName);
        sb.append(", starWeek=").append(starWeek);
        sb.append(", endWeek=").append(endWeek);
        sb.append(", srd=").append(srd);
        sb.append(", statu=").append(statu);
        sb.append(", mark=").append(mark);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arrange
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    @Override
    public Arrange clone() throws CloneNotSupportedException {
        return (Arrange) super.clone();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table arrange
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        courseId("course_id", "courseId", "INTEGER", false),
        classId("class_id", "classId", "INTEGER", false),
        roomId("room_id", "roomId", "INTEGER", false),
        techerId("techer_id", "techerId", "INTEGER", false),
        semeId("seme_id", "semeId", "INTEGER", false),
        courseName("course_name", "courseName", "VARCHAR", false),
        className("class_name", "className", "VARCHAR", false),
        roomName("room_name", "roomName", "VARCHAR", false),
        techerName("techer_name", "techerName", "VARCHAR", false),
        starWeek("star_week", "starWeek", "INTEGER", false),
        endWeek("end_week", "endWeek", "INTEGER", false),
        srd("srd", "srd", "INTEGER", false),
        statu("statu", "statu", "INTEGER", false),
        mark("mark", "mark", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table arrange
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}