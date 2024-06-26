package com.sds.animalapp.model.volunteer;

import java.util.List;

import com.sds.animalapp.domain.Member;
import com.sds.animalapp.domain.VolunteerApplication;

public interface VolunteerApplicationService {
    void apply(VolunteerApplication application);
    void cancel(int notice_id, int member_idx);
    int getRecordNum(int noticeId, int member_idx);
    List<VolunteerApplication> getAllApplications();
    List<VolunteerApplication> getApplicationsByMemberIdx(int member_idx);
    VolunteerApplication findById(int id); // 추가된 메서드
    List getAllApplicant(int notice_id);
}