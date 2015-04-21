/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class torrent_info {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected torrent_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(torrent_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_torrent_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public torrent_info(lazy_entry torrent_file, int flags) {
    this(libtorrent_jni.new_torrent_info__SWIG_0(lazy_entry.getCPtr(torrent_file), torrent_file, flags), true);
  }

  public torrent_info(lazy_entry torrent_file) {
    this(libtorrent_jni.new_torrent_info__SWIG_1(lazy_entry.getCPtr(torrent_file), torrent_file), true);
  }

  public torrent_info(String filename, int flags) {
    this(libtorrent_jni.new_torrent_info__SWIG_2(filename, flags), true);
  }

  public torrent_info(String filename) {
    this(libtorrent_jni.new_torrent_info__SWIG_3(filename), true);
  }

  public torrent_info(torrent_info t, int flags) {
    this(libtorrent_jni.new_torrent_info__SWIG_4(torrent_info.getCPtr(t), t, flags), true);
  }

  public torrent_info(torrent_info t) {
    this(libtorrent_jni.new_torrent_info__SWIG_5(torrent_info.getCPtr(t), t), true);
  }

  public torrent_info(sha1_hash info_hash, int flags) {
    this(libtorrent_jni.new_torrent_info__SWIG_6(sha1_hash.getCPtr(info_hash), info_hash, flags), true);
  }

  public torrent_info(sha1_hash info_hash) {
    this(libtorrent_jni.new_torrent_info__SWIG_7(sha1_hash.getCPtr(info_hash), info_hash), true);
  }

  public torrent_info(lazy_entry torrent_file, error_code ec, int flags) {
    this(libtorrent_jni.new_torrent_info__SWIG_8(lazy_entry.getCPtr(torrent_file), torrent_file, error_code.getCPtr(ec), ec, flags), true);
  }

  public torrent_info(lazy_entry torrent_file, error_code ec) {
    this(libtorrent_jni.new_torrent_info__SWIG_9(lazy_entry.getCPtr(torrent_file), torrent_file, error_code.getCPtr(ec), ec), true);
  }

  public torrent_info(String filename, error_code ec, int flags) {
    this(libtorrent_jni.new_torrent_info__SWIG_10(filename, error_code.getCPtr(ec), ec, flags), true);
  }

  public torrent_info(String filename, error_code ec) {
    this(libtorrent_jni.new_torrent_info__SWIG_11(filename, error_code.getCPtr(ec), ec), true);
  }

  public file_storage files() {
    return new file_storage(libtorrent_jni.torrent_info_files(swigCPtr, this), false);
  }

  public file_storage orig_files() {
    return new file_storage(libtorrent_jni.torrent_info_orig_files(swigCPtr, this), false);
  }

  public void rename_file(int index, String new_filename) {
    libtorrent_jni.torrent_info_rename_file(swigCPtr, this, index, new_filename);
  }

  public void remap_files(file_storage f) {
    libtorrent_jni.torrent_info_remap_files(swigCPtr, this, file_storage.getCPtr(f), f);
  }

  public void add_tracker(String url, int tier) {
    libtorrent_jni.torrent_info_add_tracker__SWIG_0(swigCPtr, this, url, tier);
  }

  public void add_tracker(String url) {
    libtorrent_jni.torrent_info_add_tracker__SWIG_1(swigCPtr, this, url);
  }

  public announce_entry_vector trackers() {
    return new announce_entry_vector(libtorrent_jni.torrent_info_trackers(swigCPtr, this), false);
  }

  public void add_url_seed(String url, String extern_auth, string_string_pair_vector extra_headers) {
    libtorrent_jni.torrent_info_add_url_seed__SWIG_0(swigCPtr, this, url, extern_auth, string_string_pair_vector.getCPtr(extra_headers), extra_headers);
  }

  public void add_url_seed(String url, String extern_auth) {
    libtorrent_jni.torrent_info_add_url_seed__SWIG_1(swigCPtr, this, url, extern_auth);
  }

  public void add_url_seed(String url) {
    libtorrent_jni.torrent_info_add_url_seed__SWIG_2(swigCPtr, this, url);
  }

  public void add_http_seed(String url, String extern_auth, string_string_pair_vector extra_headers) {
    libtorrent_jni.torrent_info_add_http_seed__SWIG_0(swigCPtr, this, url, extern_auth, string_string_pair_vector.getCPtr(extra_headers), extra_headers);
  }

  public void add_http_seed(String url, String extern_auth) {
    libtorrent_jni.torrent_info_add_http_seed__SWIG_1(swigCPtr, this, url, extern_auth);
  }

  public void add_http_seed(String url) {
    libtorrent_jni.torrent_info_add_http_seed__SWIG_2(swigCPtr, this, url);
  }

  public web_seed_entry_vector web_seeds() {
    return new web_seed_entry_vector(libtorrent_jni.torrent_info_web_seeds(swigCPtr, this), false);
  }

  public SWIGTYPE_p_size_type total_size() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.torrent_info_total_size(swigCPtr, this), true);
  }

  public int piece_length() {
    return libtorrent_jni.torrent_info_piece_length(swigCPtr, this);
  }

  public int num_pieces() {
    return libtorrent_jni.torrent_info_num_pieces(swigCPtr, this);
  }

  public sha1_hash info_hash() {
    return new sha1_hash(libtorrent_jni.torrent_info_info_hash(swigCPtr, this), false);
  }

  public int num_files() {
    return libtorrent_jni.torrent_info_num_files(swigCPtr, this);
  }

  public file_entry file_at(int index) {
    return new file_entry(libtorrent_jni.torrent_info_file_at(swigCPtr, this, index), true);
  }

  public file_slice_vector map_block(int piece, SWIGTYPE_p_size_type offset, int size) {
    return new file_slice_vector(libtorrent_jni.torrent_info_map_block(swigCPtr, this, piece, SWIGTYPE_p_size_type.getCPtr(offset), size), true);
  }

  public peer_request map_file(int file, SWIGTYPE_p_size_type offset, int size) {
    return new peer_request(libtorrent_jni.torrent_info_map_file(swigCPtr, this, file, SWIGTYPE_p_size_type.getCPtr(offset), size), true);
  }

  public String ssl_cert() {
    return libtorrent_jni.torrent_info_ssl_cert(swigCPtr, this);
  }

  public boolean is_valid() {
    return libtorrent_jni.torrent_info_is_valid(swigCPtr, this);
  }

  public boolean priv() {
    return libtorrent_jni.torrent_info_priv(swigCPtr, this);
  }

  public boolean is_i2p() {
    return libtorrent_jni.torrent_info_is_i2p(swigCPtr, this);
  }

  public int piece_size(int index) {
    return libtorrent_jni.torrent_info_piece_size(swigCPtr, this, index);
  }

  public sha1_hash hash_for_piece(int index) {
    return new sha1_hash(libtorrent_jni.torrent_info_hash_for_piece(swigCPtr, this, index), true);
  }

  public String hash_for_piece_ptr(int index) {
    return libtorrent_jni.torrent_info_hash_for_piece_ptr(swigCPtr, this, index);
  }

  public sha1_hash_vector merkle_tree() {
    return new sha1_hash_vector(libtorrent_jni.torrent_info_merkle_tree(swigCPtr, this), false);
  }

  public void set_merkle_tree(sha1_hash_vector h) {
    libtorrent_jni.torrent_info_set_merkle_tree(swigCPtr, this, sha1_hash_vector.getCPtr(h), h);
  }

  public String name() {
    return libtorrent_jni.torrent_info_name(swigCPtr, this);
  }

  public String creator() {
    return libtorrent_jni.torrent_info_creator(swigCPtr, this);
  }

  public String comment() {
    return libtorrent_jni.torrent_info_comment(swigCPtr, this);
  }

  public string_int_pair_vector nodes() {
    return new string_int_pair_vector(libtorrent_jni.torrent_info_nodes(swigCPtr, this), false);
  }

  public void add_node(string_int_pair node) {
    libtorrent_jni.torrent_info_add_node(swigCPtr, this, string_int_pair.getCPtr(node), node);
  }

  public boolean parse_info_section(lazy_entry e, error_code ec, int flags) {
    return libtorrent_jni.torrent_info_parse_info_section(swigCPtr, this, lazy_entry.getCPtr(e), e, error_code.getCPtr(ec), ec, flags);
  }

  public lazy_entry info(String key) {
    long cPtr = libtorrent_jni.torrent_info_info(swigCPtr, this, key);
    return (cPtr == 0) ? null : new lazy_entry(cPtr, false);
  }

  public void swap(torrent_info ti) {
    libtorrent_jni.torrent_info_swap(swigCPtr, this, torrent_info.getCPtr(ti), ti);
  }

  public int metadata_size() {
    return libtorrent_jni.torrent_info_metadata_size(swigCPtr, this);
  }

  public boolean add_merkle_nodes(int_sha1_hash_map subtree, int piece) {
    return libtorrent_jni.torrent_info_add_merkle_nodes(swigCPtr, this, int_sha1_hash_map.getCPtr(subtree), subtree, piece);
  }

  public int_sha1_hash_map build_merkle_list(int piece) {
    return new int_sha1_hash_map(libtorrent_jni.torrent_info_build_merkle_list(swigCPtr, this, piece), true);
  }

  public boolean is_merkle_torrent() {
    return libtorrent_jni.torrent_info_is_merkle_torrent(swigCPtr, this);
  }

  public int get_creation_date() {
    return libtorrent_jni.torrent_info_get_creation_date(swigCPtr, this);
  }

}
