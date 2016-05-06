package com.douncoding.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.douncoding.dao.Place;
import com.douncoding.dao.Instructor;
import com.douncoding.dao.Lesson;
import com.douncoding.dao.Student;
import com.douncoding.dao.LessonTime;

import com.douncoding.dao.PlaceDao;
import com.douncoding.dao.InstructorDao;
import com.douncoding.dao.LessonDao;
import com.douncoding.dao.StudentDao;
import com.douncoding.dao.LessonTimeDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig placeDaoConfig;
    private final DaoConfig instructorDaoConfig;
    private final DaoConfig lessonDaoConfig;
    private final DaoConfig studentDaoConfig;
    private final DaoConfig lessonTimeDaoConfig;

    private final PlaceDao placeDao;
    private final InstructorDao instructorDao;
    private final LessonDao lessonDao;
    private final StudentDao studentDao;
    private final LessonTimeDao lessonTimeDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        placeDaoConfig = daoConfigMap.get(PlaceDao.class).clone();
        placeDaoConfig.initIdentityScope(type);

        instructorDaoConfig = daoConfigMap.get(InstructorDao.class).clone();
        instructorDaoConfig.initIdentityScope(type);

        lessonDaoConfig = daoConfigMap.get(LessonDao.class).clone();
        lessonDaoConfig.initIdentityScope(type);

        studentDaoConfig = daoConfigMap.get(StudentDao.class).clone();
        studentDaoConfig.initIdentityScope(type);

        lessonTimeDaoConfig = daoConfigMap.get(LessonTimeDao.class).clone();
        lessonTimeDaoConfig.initIdentityScope(type);

        placeDao = new PlaceDao(placeDaoConfig, this);
        instructorDao = new InstructorDao(instructorDaoConfig, this);
        lessonDao = new LessonDao(lessonDaoConfig, this);
        studentDao = new StudentDao(studentDaoConfig, this);
        lessonTimeDao = new LessonTimeDao(lessonTimeDaoConfig, this);

        registerDao(Place.class, placeDao);
        registerDao(Instructor.class, instructorDao);
        registerDao(Lesson.class, lessonDao);
        registerDao(Student.class, studentDao);
        registerDao(LessonTime.class, lessonTimeDao);
    }
    
    public void clear() {
        placeDaoConfig.getIdentityScope().clear();
        instructorDaoConfig.getIdentityScope().clear();
        lessonDaoConfig.getIdentityScope().clear();
        studentDaoConfig.getIdentityScope().clear();
        lessonTimeDaoConfig.getIdentityScope().clear();
    }

    public PlaceDao getPlaceDao() {
        return placeDao;
    }

    public InstructorDao getInstructorDao() {
        return instructorDao;
    }

    public LessonDao getLessonDao() {
        return lessonDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public LessonTimeDao getLessonTimeDao() {
        return lessonTimeDao;
    }

}