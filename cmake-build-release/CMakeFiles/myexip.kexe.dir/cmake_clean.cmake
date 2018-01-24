file(REMOVE_RECURSE
  "myexip.kexe.pdb"
  "myexip.kexe"
)

# Per-language clean rules from dependency scanning.
foreach(lang )
  include(CMakeFiles/myexip.kexe.dir/cmake_clean_${lang}.cmake OPTIONAL)
endforeach()
