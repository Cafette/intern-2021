--------------------------------------------------------------------------------
-- address.m_address のレイアウト変更
--   注意！！：テーブルに依存するオブジェクト（ビューなど）が削除される場合があります。それらのオブジェクトは復元されません。
--   2020/11/07 TK
--------------------------------------------------------------------------------


-- 新テーブルの作成
create table address.m_address (
  zip_cd character(7) not null
  , prefecture_name character varying(4) not null
  , city_name character varying(200) not null
  , street_name character varying(200) not null
)
/


-- 主キーの作成
alter table address.m_address  add primary key (zip_cd)
/


-- コメントの作成
comment on table address.m_address is '住所マスタ'
/

comment on column address.m_address.zip_cd is ''
/

comment on column address.m_address.prefecture_name is ''
/

comment on column address.m_address.city_name is ''
/

comment on column address.m_address.street_name is ''
/

