package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.beans.TepascoreBean;
import edu.nefu.gdms.domain.Tepascore;

public interface TepascoreManager {
	
	
	
	/**
	 * ��ӷ���
	 * @param pid
	 * @param teid
	 * @param score
	 * @return
	 */
	String add(String pid, String teid, String score);
	
	/**
	 * �޸Ĵ����Ϣ
	 * @param pid
	 * @param teid
	 * @param score
	 */
	void modify(String pid, String teid, String score);
	
	
	/**
	 * ɾ��ý׶����д��
	 */
	void removeall();
	/**
	 * �õ����з���
	 * @return
	 */
	List<TepascoreBean> getAll();
	
	
	/**
	 * ͨ������id���ʦid�õ���Ӧ����
	 * @param pid
	 * @param teid
	 * @return
	 */
	TepascoreBean getByPTe(String pid, String teid);
	
	/**
	 * ͨ������id��ø��������з���
	 * @param pid
	 * @return
	 */
	List<TepascoreBean> getByPid(String pid);
	
	
	/**
	 * ͨ����ʦid�����ʦ����
	 * @param teid
	 * @return
	 */
	List<TepascoreBean> getByTeid(String teid);

}
