package com.ruitong.huiyi3.beans;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.ruitong.huiyi3.beans.BaoCunBean;
import com.ruitong.huiyi3.beans.BenDiMBbean;
import com.ruitong.huiyi3.beans.BenDiQianDao;
import com.ruitong.huiyi3.beans.BenDiRenShuBean;
import com.ruitong.huiyi3.beans.HuanYinYuBean;
import com.ruitong.huiyi3.beans.MBLeiXingBean;
import com.ruitong.huiyi3.beans.MoShengRenBean;
import com.ruitong.huiyi3.beans.QianDaoId;
import com.ruitong.huiyi3.beans.RenYuanInFo;
import com.ruitong.huiyi3.beans.SheBeiInFoBean;
import com.ruitong.huiyi3.beans.ShiBieJiLuBean;
import com.ruitong.huiyi3.beans.ShiPingBean;
import com.ruitong.huiyi3.beans.TanChuangBean;
import com.ruitong.huiyi3.beans.ZhuJiBeanH;

import com.ruitong.huiyi3.beans.BaoCunBeanDao;
import com.ruitong.huiyi3.beans.BenDiMBbeanDao;
import com.ruitong.huiyi3.beans.BenDiQianDaoDao;
import com.ruitong.huiyi3.beans.BenDiRenShuBeanDao;
import com.ruitong.huiyi3.beans.HuanYinYuBeanDao;
import com.ruitong.huiyi3.beans.MBLeiXingBeanDao;
import com.ruitong.huiyi3.beans.MoShengRenBeanDao;
import com.ruitong.huiyi3.beans.QianDaoIdDao;
import com.ruitong.huiyi3.beans.RenYuanInFoDao;
import com.ruitong.huiyi3.beans.SheBeiInFoBeanDao;
import com.ruitong.huiyi3.beans.ShiBieJiLuBeanDao;
import com.ruitong.huiyi3.beans.ShiPingBeanDao;
import com.ruitong.huiyi3.beans.TanChuangBeanDao;
import com.ruitong.huiyi3.beans.ZhuJiBeanHDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig baoCunBeanDaoConfig;
    private final DaoConfig benDiMBbeanDaoConfig;
    private final DaoConfig benDiQianDaoDaoConfig;
    private final DaoConfig benDiRenShuBeanDaoConfig;
    private final DaoConfig huanYinYuBeanDaoConfig;
    private final DaoConfig mBLeiXingBeanDaoConfig;
    private final DaoConfig moShengRenBeanDaoConfig;
    private final DaoConfig qianDaoIdDaoConfig;
    private final DaoConfig renYuanInFoDaoConfig;
    private final DaoConfig sheBeiInFoBeanDaoConfig;
    private final DaoConfig shiBieJiLuBeanDaoConfig;
    private final DaoConfig shiPingBeanDaoConfig;
    private final DaoConfig tanChuangBeanDaoConfig;
    private final DaoConfig zhuJiBeanHDaoConfig;

    private final BaoCunBeanDao baoCunBeanDao;
    private final BenDiMBbeanDao benDiMBbeanDao;
    private final BenDiQianDaoDao benDiQianDaoDao;
    private final BenDiRenShuBeanDao benDiRenShuBeanDao;
    private final HuanYinYuBeanDao huanYinYuBeanDao;
    private final MBLeiXingBeanDao mBLeiXingBeanDao;
    private final MoShengRenBeanDao moShengRenBeanDao;
    private final QianDaoIdDao qianDaoIdDao;
    private final RenYuanInFoDao renYuanInFoDao;
    private final SheBeiInFoBeanDao sheBeiInFoBeanDao;
    private final ShiBieJiLuBeanDao shiBieJiLuBeanDao;
    private final ShiPingBeanDao shiPingBeanDao;
    private final TanChuangBeanDao tanChuangBeanDao;
    private final ZhuJiBeanHDao zhuJiBeanHDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        baoCunBeanDaoConfig = daoConfigMap.get(BaoCunBeanDao.class).clone();
        baoCunBeanDaoConfig.initIdentityScope(type);

        benDiMBbeanDaoConfig = daoConfigMap.get(BenDiMBbeanDao.class).clone();
        benDiMBbeanDaoConfig.initIdentityScope(type);

        benDiQianDaoDaoConfig = daoConfigMap.get(BenDiQianDaoDao.class).clone();
        benDiQianDaoDaoConfig.initIdentityScope(type);

        benDiRenShuBeanDaoConfig = daoConfigMap.get(BenDiRenShuBeanDao.class).clone();
        benDiRenShuBeanDaoConfig.initIdentityScope(type);

        huanYinYuBeanDaoConfig = daoConfigMap.get(HuanYinYuBeanDao.class).clone();
        huanYinYuBeanDaoConfig.initIdentityScope(type);

        mBLeiXingBeanDaoConfig = daoConfigMap.get(MBLeiXingBeanDao.class).clone();
        mBLeiXingBeanDaoConfig.initIdentityScope(type);

        moShengRenBeanDaoConfig = daoConfigMap.get(MoShengRenBeanDao.class).clone();
        moShengRenBeanDaoConfig.initIdentityScope(type);

        qianDaoIdDaoConfig = daoConfigMap.get(QianDaoIdDao.class).clone();
        qianDaoIdDaoConfig.initIdentityScope(type);

        renYuanInFoDaoConfig = daoConfigMap.get(RenYuanInFoDao.class).clone();
        renYuanInFoDaoConfig.initIdentityScope(type);

        sheBeiInFoBeanDaoConfig = daoConfigMap.get(SheBeiInFoBeanDao.class).clone();
        sheBeiInFoBeanDaoConfig.initIdentityScope(type);

        shiBieJiLuBeanDaoConfig = daoConfigMap.get(ShiBieJiLuBeanDao.class).clone();
        shiBieJiLuBeanDaoConfig.initIdentityScope(type);

        shiPingBeanDaoConfig = daoConfigMap.get(ShiPingBeanDao.class).clone();
        shiPingBeanDaoConfig.initIdentityScope(type);

        tanChuangBeanDaoConfig = daoConfigMap.get(TanChuangBeanDao.class).clone();
        tanChuangBeanDaoConfig.initIdentityScope(type);

        zhuJiBeanHDaoConfig = daoConfigMap.get(ZhuJiBeanHDao.class).clone();
        zhuJiBeanHDaoConfig.initIdentityScope(type);

        baoCunBeanDao = new BaoCunBeanDao(baoCunBeanDaoConfig, this);
        benDiMBbeanDao = new BenDiMBbeanDao(benDiMBbeanDaoConfig, this);
        benDiQianDaoDao = new BenDiQianDaoDao(benDiQianDaoDaoConfig, this);
        benDiRenShuBeanDao = new BenDiRenShuBeanDao(benDiRenShuBeanDaoConfig, this);
        huanYinYuBeanDao = new HuanYinYuBeanDao(huanYinYuBeanDaoConfig, this);
        mBLeiXingBeanDao = new MBLeiXingBeanDao(mBLeiXingBeanDaoConfig, this);
        moShengRenBeanDao = new MoShengRenBeanDao(moShengRenBeanDaoConfig, this);
        qianDaoIdDao = new QianDaoIdDao(qianDaoIdDaoConfig, this);
        renYuanInFoDao = new RenYuanInFoDao(renYuanInFoDaoConfig, this);
        sheBeiInFoBeanDao = new SheBeiInFoBeanDao(sheBeiInFoBeanDaoConfig, this);
        shiBieJiLuBeanDao = new ShiBieJiLuBeanDao(shiBieJiLuBeanDaoConfig, this);
        shiPingBeanDao = new ShiPingBeanDao(shiPingBeanDaoConfig, this);
        tanChuangBeanDao = new TanChuangBeanDao(tanChuangBeanDaoConfig, this);
        zhuJiBeanHDao = new ZhuJiBeanHDao(zhuJiBeanHDaoConfig, this);

        registerDao(BaoCunBean.class, baoCunBeanDao);
        registerDao(BenDiMBbean.class, benDiMBbeanDao);
        registerDao(BenDiQianDao.class, benDiQianDaoDao);
        registerDao(BenDiRenShuBean.class, benDiRenShuBeanDao);
        registerDao(HuanYinYuBean.class, huanYinYuBeanDao);
        registerDao(MBLeiXingBean.class, mBLeiXingBeanDao);
        registerDao(MoShengRenBean.class, moShengRenBeanDao);
        registerDao(QianDaoId.class, qianDaoIdDao);
        registerDao(RenYuanInFo.class, renYuanInFoDao);
        registerDao(SheBeiInFoBean.class, sheBeiInFoBeanDao);
        registerDao(ShiBieJiLuBean.class, shiBieJiLuBeanDao);
        registerDao(ShiPingBean.class, shiPingBeanDao);
        registerDao(TanChuangBean.class, tanChuangBeanDao);
        registerDao(ZhuJiBeanH.class, zhuJiBeanHDao);
    }
    
    public void clear() {
        baoCunBeanDaoConfig.clearIdentityScope();
        benDiMBbeanDaoConfig.clearIdentityScope();
        benDiQianDaoDaoConfig.clearIdentityScope();
        benDiRenShuBeanDaoConfig.clearIdentityScope();
        huanYinYuBeanDaoConfig.clearIdentityScope();
        mBLeiXingBeanDaoConfig.clearIdentityScope();
        moShengRenBeanDaoConfig.clearIdentityScope();
        qianDaoIdDaoConfig.clearIdentityScope();
        renYuanInFoDaoConfig.clearIdentityScope();
        sheBeiInFoBeanDaoConfig.clearIdentityScope();
        shiBieJiLuBeanDaoConfig.clearIdentityScope();
        shiPingBeanDaoConfig.clearIdentityScope();
        tanChuangBeanDaoConfig.clearIdentityScope();
        zhuJiBeanHDaoConfig.clearIdentityScope();
    }

    public BaoCunBeanDao getBaoCunBeanDao() {
        return baoCunBeanDao;
    }

    public BenDiMBbeanDao getBenDiMBbeanDao() {
        return benDiMBbeanDao;
    }

    public BenDiQianDaoDao getBenDiQianDaoDao() {
        return benDiQianDaoDao;
    }

    public BenDiRenShuBeanDao getBenDiRenShuBeanDao() {
        return benDiRenShuBeanDao;
    }

    public HuanYinYuBeanDao getHuanYinYuBeanDao() {
        return huanYinYuBeanDao;
    }

    public MBLeiXingBeanDao getMBLeiXingBeanDao() {
        return mBLeiXingBeanDao;
    }

    public MoShengRenBeanDao getMoShengRenBeanDao() {
        return moShengRenBeanDao;
    }

    public QianDaoIdDao getQianDaoIdDao() {
        return qianDaoIdDao;
    }

    public RenYuanInFoDao getRenYuanInFoDao() {
        return renYuanInFoDao;
    }

    public SheBeiInFoBeanDao getSheBeiInFoBeanDao() {
        return sheBeiInFoBeanDao;
    }

    public ShiBieJiLuBeanDao getShiBieJiLuBeanDao() {
        return shiBieJiLuBeanDao;
    }

    public ShiPingBeanDao getShiPingBeanDao() {
        return shiPingBeanDao;
    }

    public TanChuangBeanDao getTanChuangBeanDao() {
        return tanChuangBeanDao;
    }

    public ZhuJiBeanHDao getZhuJiBeanHDao() {
        return zhuJiBeanHDao;
    }

}
