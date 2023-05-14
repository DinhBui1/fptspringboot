package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.BaiViet;
import com.example.fptsprinboot.Repository.BaiVietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaiVietService {
    @Autowired
    private BaiVietRepository repo;

    public List<BaiViet> getallBaiViet()
    {
        return  repo.findAll();
    }

    public BaiViet createBaiViet(BaiViet baiViet)
    {
        return repo.save(baiViet);
    }
    public BaiViet findBaiVietbyid(int id)
    {
        return repo.findBaiVietByid(id);
    }

    public BaiViet updateBaiViet(int id, BaiViet baiViet)
    {
        BaiViet bv= repo.findBaiVietByid(id);
        if(bv!=null)
        {
            bv.setAnh(baiViet.getAnh());
            bv.setNoiDung(baiViet.getNoiDung());
            bv.setNgayCapNhat(baiViet.getNgayCapNhat());
            bv.setTieuDeBV(baiViet.getTieuDeBV());
            bv.setNgayTao(baiViet.getNgayTao());
            return repo.save(bv);
        }
        return  null;
    }
}
