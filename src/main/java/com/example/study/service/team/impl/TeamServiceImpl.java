package com.example.study.service.team.impl;

import com.example.study.entity.team.Team;
import com.example.study.mapper.team.TeamMapper;
import com.example.study.service.team.ITeamService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caorongwu
 * @since 2020-08-12
 */
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team> implements ITeamService {

    @Override
    public  IPage<Team> findListByPage(Integer page, Integer pageCount){
        IPage<Team> wherePage = new Page<>(page, pageCount);
        Team where = new Team();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Team team){
        return baseMapper.insert(team);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Team team){
        return baseMapper.updateById(team);
    }

    @Override
    public Team findById(Long id){
        return  baseMapper.selectById(id);
    }
}
